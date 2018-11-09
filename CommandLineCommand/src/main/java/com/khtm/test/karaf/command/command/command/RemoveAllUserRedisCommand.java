package com.khtm.test.karaf.command.command.command;

import com.khtm.test.karaf.command.api.UserServiceRedis;
import org.apache.karaf.shell.api.action.Action;
import org.apache.karaf.shell.api.action.Command;
import org.apache.karaf.shell.api.action.lifecycle.Reference;
import org.apache.karaf.shell.api.action.lifecycle.Service;

@Service
@Command(scope = "khtm", name = "remove-all-user-redis", description = "Remove all users of current list on Redis.")
public class RemoveAllUserRedisCommand implements Action {

    @Reference
    private UserServiceRedis userServiceRedis;

    public Object execute() throws Exception {
        userServiceRedis.clear();
        return null;
    }
}
