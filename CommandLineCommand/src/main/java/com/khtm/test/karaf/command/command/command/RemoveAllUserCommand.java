package com.khtm.test.karaf.command.command.command;


import com.khtm.test.karaf.command.api.UserService;
import org.apache.karaf.shell.api.action.Action;
import org.apache.karaf.shell.api.action.Command;
import org.apache.karaf.shell.api.action.lifecycle.Reference;
import org.apache.karaf.shell.api.action.lifecycle.Service;

@Service
@Command(scope = "khtm", name = "user-remove-all", description = "Clear all users that exist in the current list.")
public class RemoveAllUserCommand implements Action {

    @Reference
    private UserService userService;

    public Object execute() throws Exception {
        userService.clear();
        return null;
    }
}
