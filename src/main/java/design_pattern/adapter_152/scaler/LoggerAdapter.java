package design_pattern.adapter_152.scaler;

import com.scaler.lld.designpatterns.adapter.thirdparty.logger.LoggerAPI;

public class LoggerAdapter implements ILogger {
    private LoggerAPI loggerAPI = new LoggerAPI();

    @Override
    public void log(String message) {
        loggerAPI.printLog(message.getBytes());
    }
}
