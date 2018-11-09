package com.khtm.test.karaf.command.command.command;

import com.khtm.test.karaf.command.api.UserServiceRedis;
import com.khtm.test.karaf.command.command.completer.CompleterRedis;
import org.apache.karaf.shell.api.action.Action;
import org.apache.karaf.shell.api.action.Argument;
import org.apache.karaf.shell.api.action.Command;
import org.apache.karaf.shell.api.action.Completion;
import org.apache.karaf.shell.api.action.lifecycle.Reference;
import org.apache.karaf.shell.api.action.lifecycle.Service;

import java.util.List;

@Service
@Command(scope = "khtm", name = "remove-user-redis", description = "Remove user from current list on Redis by ID")
public class RemoveUserRedisCommand implements Action {

    @Reference
    private UserServiceRedis userServiceRedis;

    @Argument(index = 0, name = "ids", description = "List of ID user thar want to remove from redis list", required = true, multiValued = true)
    @Completion(CompleterRedis.class)
    List<Integer> ids;

    public Object execute() throws Exception {
        for(int id : ids){
            userServiceRedis.remove(id);
        }
        return null;
    }
}
