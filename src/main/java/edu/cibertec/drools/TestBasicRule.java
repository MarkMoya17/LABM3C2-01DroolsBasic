package edu.cibertec.drools;


import org.drools.KnowledgeBase;
import org.drools.runtime.StatefulKnowledgeSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.cibertec.drools.bean.Account;

public class TestBasicRule {
	
	private static final Logger logger = LoggerFactory.getLogger(TestBasicRule.class);
	public static void main(String[] args) {
		
		KnowledgeBase kbase = KnowledgeBaseHelper.create("basicRule.drl");
		StatefulKnowledgeSession session = kbase.newStatefulKnowledgeSession();
		
		logger.info("Reglas Leidas!");
		Account account1 = new Account("001", 1000);
		Account account2 = new Account("002", 500);
		session.insert(account1);
		session.insert(account2);
		session.fireAllRules();
		
	}
}
