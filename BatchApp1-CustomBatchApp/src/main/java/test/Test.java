package test;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
	
	ApplicationContext ctx=null;
	JobLauncher launcher=null;
	Job job=null;
	//create IOC container
	ctx=new ClassPathXmlApplicationContext("com/nt/cfgs/applicationContext.xml");
	//get JOB Launcher
	launcher=ctx.getBean("joblauncher",JobLauncher.class);
	job=ctx.getBean("simplejob",Job.class);
	try{
		
		launcher.run(job,new JobParameters());
	}
	catch(Exception se){
		se.printStackTrace();
	}
	
	//close container
	((AbstractApplicationContext) ctx).close();
	}
}
