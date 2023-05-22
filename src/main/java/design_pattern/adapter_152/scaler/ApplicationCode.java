package design_pattern.adapter_152.scaler;

public class ApplicationCode {
    ILogger logger;

    public ApplicationCode(ILogger logger) {
        this.logger = logger;
    }
}


// Many Logging libraries:
// - Log4J => sendStream()
// - Logger => printLog()
// - Slo4j => out()