package com.acme.dbo.txlog;

import com.acme.dbo.txlog.message.IntMessage;
import com.acme.dbo.txlog.message.Message;
import com.acme.dbo.txlog.saver.ConsoleSaver;
import com.acme.dbo.txlog.saver.Saver;

public class LogService {
    private Saver saver;
    private Message currentAccumulatedMessage;

    public LogService(Saver saver) {
        this.saver = saver;
    }

    public void log(Message message) {
        if (currentAccumulatedMessage != null && currentAccumulatedMessage.isSame(message)) {
            currentAccumulatedMessage.accumulate(message);
        } else {
            saver.save(message.decorate());
            currentAccumulatedMessage = message;
        }
    }

    public void flush(){
        currentAccumulatedMessage = null;
    }
}
