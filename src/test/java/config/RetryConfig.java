package config;

import static logger.CustomLogger.logger;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryConfig implements IRetryAnalyzer {
    private int retryCount = 1;

    @Override
    public boolean retry(ITestResult result) {
        int maxRetryCount = 2;
        if (retryCount < maxRetryCount) {
            if (result.getStatus() == 2) {
                logger.info("Retrying test : " + result.getName());
                retryCount++;
                return true;
            }
        }
        return false;
    }
}