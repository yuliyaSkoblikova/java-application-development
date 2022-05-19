package com.acme.dbo.txlog;

import com.acme.dbo.txlog.message.IntMessage;
import com.acme.dbo.txlog.saver.ConsoleSaver;

public class LogService {

    public void log(IntMessage intMessage) {
        intMessage.log(intMessage.getValue(), new ConsoleSaver());
    }
}
