package com.csc680.orbit.service.impl;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.ClasspathPropertiesFileCredentialsProvider;
import com.amazonaws.auth.InstanceProfileCredentialsProvider;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.AmazonSNSClientBuilder;
import com.amazonaws.services.sns.model.PublishRequest;
import com.amazonaws.services.sns.model.PublishResult;
import com.csc680.orbit.model.pojo.Ticket;
import com.csc680.orbit.repository.TicketRepository;
import com.csc680.orbit.service.TicketService;

import javassist.bytecode.stackmap.TypeData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service("ticketService")
@PropertySource("classpath:enviornmental.properties")
public class TicketServiceImpl implements TicketService{

    private static final Logger LOGGER = Logger.getLogger(TypeData.ClassName.class.getName());

    @Autowired
    private TicketRepository ticketRepository;
    
    @Autowired
    private Environment enviornment;
    
    

    @Override
    public Ticket addTicket(Ticket ticket) {
        Ticket newTicket = ticketRepository.save(ticket);
        if(newTicket != null){
        	
        	
        	String awsSecret;
        	String awsAccount;
        	String topicArn = enviornment.getProperty("aws.sns.ticket.topic.arn");
        	Region region = Region.getRegion(Regions.US_EAST_2);
        	AmazonSNS snsClient;

        	if(enviornment.getProperty("local.env", boolean.class) == true){
        		awsSecret = enviornment.getProperty("aws.secret.key");
        		awsAccount = enviornment.getProperty("aws.account");
        		
        		BasicAWSCredentials creds = new BasicAWSCredentials(awsAccount, awsSecret);
        		snsClient = AmazonSNSClientBuilder.standard().withCredentials(new AWSStaticCredentialsProvider(creds)).withRegion(region.getName()).build();
        	}
        	else{
        		snsClient = AmazonSNSClientBuilder.standard().withCredentials(new InstanceProfileCredentialsProvider(false)).build();
        	}
        	
        	//publish to an SNS topic
        	String msg = "A user reported a bug in the Orbit app. \n";
        	msg += "User email: " + newTicket.getUser().getEmail() + "\n";
        	msg += "Name of issue: " + newTicket.getName() + "\n";
        	msg += "Description of issue: " + newTicket.getDescription() + "\n";
        	msg += "Priority: " + newTicket.getPriority() + "\n";
        	PublishRequest publishRequest = new PublishRequest(topicArn, msg);
        	PublishResult publishResult = snsClient.publish(publishRequest);
        	//print MessageId of message published to SNS topic
        	LOGGER.info("Sent SNS message - " + publishResult.getMessageId());
        }
        return newTicket;
    }
    
    @Override
	public List<Ticket> getAllTickets() {
		List<Ticket> tickets = (List<Ticket>) ticketRepository.findAll();
		return tickets;
	}
}
