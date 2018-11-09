package com.khtm.test.karaf.command.command.command;

import com.khtm.test.karaf.command.api.User;
import com.khtm.test.karaf.command.api.UserServiceRedis;
import org.apache.karaf.shell.api.action.Action;
import org.apache.karaf.shell.api.action.Command;
import org.apache.karaf.shell.api.action.lifecycle.Reference;
import org.apache.karaf.shell.api.action.lifecycle.Service;
import org.apache.karaf.shell.support.table.ShellTable;

import java.util.Collection;

@Service
@Command(scope = "khtm", name = "list-user-redis", description = "List of current user on redis database.")
public class ListUserRedisCommand implements Action {

    @Reference
    private UserServiceRedis userServiceRedis;

    public Object execute() throws Exception {
        Collection<User> users = userServiceRedis.list();
        ShellTable shellTable = new ShellTable();
        shellTable.column("ID");
        shellTable.column("First Name");
        shellTable.column("Last Name");
        shellTable.column("Phone Number");
        for(User user : users){
            shellTable.addRow().addContent(user.getId(), user.getFirstName(), user.getLastName(), user.getPhoneNumber());
        }
        shellTable.print(System.out);
        return null;
    }
}
