package com.acme.dbo.txlog;

import com.acme.dbo.txlog.message.DefaultMessage;
import com.acme.dbo.txlog.message.IntMessage;
import com.acme.dbo.txlog.message.Message;
import com.acme.dbo.txlog.saver.ConsoleSaver;
import com.acme.dbo.txlog.saver.Saver;

public class LogService {
    private Saver saver;
    private Message currentAccumulatedMessage;

    public LogService(Saver saver) {
        this.saver = saver;
        currentAccumulatedMessage = new DefaultMessage();
    }

    public void log(Message message) {

        if (currentAccumulatedMessage.isSame(message)) {
            currentAccumulatedMessage = currentAccumulatedMessage.accumulate(message);
        } else {
            saver.save(currentAccumulatedMessage.decorate());
            currentAccumulatedMessage = message;
        }
    }

    public void flush(){
        saver.save(currentAccumulatedMessage.decorate());
        currentAccumulatedMessage = new DefaultMessage();
    }
}
