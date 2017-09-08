import org.apache.log4j.Logger;

public class HelloLog4J {

	public static void main(String[] args) {

		Logger logger = Logger.getLogger("MyFile");

		logger.fatal("This is a FATAL message.");
		logger.error("This is an ERROR message.");
		logger.warn("This is a WARN message.");
		logger.info("This is an INFO message.");
		logger.debug("This is a DEBUG message.");
		logger.trace("This is a TRACE message.");
	}
}
