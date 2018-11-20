# Install Application

* Requirement:
    * Karaf 4.x.x
    * Redis
    * jdk1.8

Add repository:

``
karaf@root()>feature:repo-add mvn:com.khtm.test.karaf/CommandLineFeature/1.0-SNAPSHOT/xml
``

Install bundles:

``
karaf@root()>feature:install CommandLineProvider
``

``
karaf@root()>feature:install CommandLine
``

# Uninstall Application

``
karaf@root()>feature:uninstall CommandLine
``

``
karaf@root()>feature:repo-remove khtm-test-command-1.0-SNAPSHOT
``


# Application
## How to use it on local RAM
* Add user to list

``
karaf@root()> khtm:add-user alireza khatamiDoost 09194018087
``

* Remove user from list

``
karaf@root()> khtm:user-remove <user-id-1> <user-id-2> ...
``

if you press Tab all user ids show on screen

* Print current list

``
karaf@root()> khtm:user-list
``

* Remove all users from current list

``
karaf@root()> khtm:user-remove-all
``

## How to use it on Redis

* Add user to list

``
karaf@root()> khtm:add-user-redis alireza khatamiDoost 09194018087
``

* Remove user from list

``
karaf@root()> khtm:remove-user-redis <user-id-1> <user-id-2> ...
``

if you press Tab all user ids show on screen

* Print current list

``
karaf@root()> khtm:list-user-redis
``

* Remove all users from current list

``
karaf@root()> khtm:remove-all-user-redis
``