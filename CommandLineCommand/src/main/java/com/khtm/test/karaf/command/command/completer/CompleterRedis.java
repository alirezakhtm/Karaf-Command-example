package com.khtm.test.karaf.command.command.completer;

import com.khtm.test.karaf.command.api.User;
import com.khtm.test.karaf.command.api.UserServiceRedis;
import org.apache.karaf.shell.api.action.lifecycle.Reference;
import org.apache.karaf.shell.api.action.lifecycle.Service;
import org.apache.karaf.shell.api.console.CommandLine;
import org.apache.karaf.shell.api.console.Completer;
import org.apache.karaf.shell.api.console.Session;
import org.apache.karaf.shell.support.completers.StringsCompleter;

import java.util.Collection;
import java.util.List;

@Service
public class CompleterRedis implements Completer {

    @Reference
    private UserServiceRedis userServiceRedis;

    public int complete(Session session, CommandLine commandLine, List<String> list) {
        Collection<User> users = userServiceRedis.list();
        StringsCompleter stringsCompleter = new StringsCompleter();
        for(User user : users){
            stringsCompleter.getStrings().add(String.valueOf(user.getId()));
        }
        return stringsCompleter.complete(session, commandLine, list);
    }
}
