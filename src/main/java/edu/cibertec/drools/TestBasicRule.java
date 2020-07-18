package edu.cibertec.drools;


import org.drools.KnowledgeBase;
import org.drools.runtime.StatefulKnowledgeSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.cibertec.drools.bean.Account;
import edu.cibertec.drools.bean.Bonus;

public class TestBasicRule {
	
	private static final Logger logger = LoggerFactory.getLogger(TestBasicRule.class);
	public static void main(String[] args) {
		
		KnowledgeBase kbase = KnowledgeBaseHelper.create("basicRule.drl");
		StatefulKnowledgeSession session = kbase.newStatefulKnowledgeSession();
		
		try {
			logger.info("Reglas Leidas!");
			Account account1 = new Account("001", 80);
			Account account2 = new Account("002", 500);
			Account account3 = new Account("003", 200);
			Account account4 = new Account("004", 150);
			Bonus bonus1 = new Bonus("GOAL", 40); 
			session.insert(account1);
			session.insert(account2);
			session.insert(account3);
			session.insert(account4);
			session.insert(bonus1);
			session.fireAllRules();	
			
			logger.info(account1.toString());
			logger.info(account2.toString());
			logger.info(account3.toString());
			logger.info(account4.toString());
			
		} catch (Exception e) {
			logger.info("Error al ejecutar las reglas!");
		} finally {
			session.dispose();
		}
		
	}
}
