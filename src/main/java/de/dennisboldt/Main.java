package de.dennisboldt;

import org.apache.log4j.Logger;

public class Main {

    private Logger logger = Logger.getLogger(this.getClass().getName());
	//private Logger logger = Logger.getRootLogger();
	
	public Main() {
		logger.debug("Meine Debug-Meldung");
		logger.info("Meine Info-Meldung");
		logger.warn("Meine Warn-Meldung");
		logger.error("Meine Error-Meldung");
		logger.fatal("Meine Fatal-Meldung");
	}

	public static void main(String[] args) {
		new Main();
		try {
			Thread.sleep(10);
		} catch (InterruptedException e) {}
	}

}
