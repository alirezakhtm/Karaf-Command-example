# Install Application

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
karaf@root()>
``

* Remove user from list

``
karaf@root()>
``

* Print current list

``
karaf@root()>
``

* Remove all users from current list

``
karaf@root()>
``

## How to use it on Redis

* Add user to list

``
karaf@root()>
``

* Remove user from list

``
karaf@root()>
``

* Print current list

``
karaf@root()>
``

* Remove all users from current list

``
karaf@root()>
``