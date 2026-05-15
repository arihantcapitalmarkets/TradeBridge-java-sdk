For Config and Context refer project specific config repo.

### Profile Management
- Team people a requested to use only below profile and file format.
    ```
    dev [dev or sit]  - config_dev.properties.exclude, jslog_dev.properties.exclude, context_dev.xml
    uat [no dev]*     - config_uat.properties.exclude, jslog_uat.properties.exclude, context_uat.xml
    cug [pilot]       - config_cug.properties.exclude, jslog_cug.properties.exclude, context_cug.xml
    prod [production] - config_prod.properties.exclude, jslog_prod.properties.exclude, context_prod.xml
    ```
- If no development server available uat can be used and deployed by developer.

### Building and Deployment
Copy respective project config and context.xml's.

#### Special Params
###### \-Dprofile
- \-Dprofile=appender if you need to append a value at end of you war file name say war-pilot, war-cug etc.
- You can run using command.```mvn clean package -Dprofile=-pilot -P cug``` **FinalName war will be : edis-pilot.war**
- If you are not specified anything default there will be no appender.
- _Note_
  - if - is needed in appender then -Dprofile should contains **_-_**
  - default value will be empty.**[if not specified]**.
###### \-Ddomain
- \-Ddomain=api.msxtend.com tomcat server domain.
- default value will be localhost.**[if not specified]**.

<h4 style=text-align:center>*For Developer*</h4>
- Create a new server in maven settings.xml file as below.

```
  <server>
    <id>tomcat-admin</id>
    <username> {your server username} </username>
    <password>{your server password}</password>
  </server>
  ```
- Once created run the command

  ```
  mvn clean package tomcat7:deploy/redeploy -Dprofile=appender -Ddomain={server domain} -P dev
  
  Example : mvn clean package tomcat7:deploy/redeploy -Dprofile=-dev -Ddomain=dev.gwcindia.in -P dev
  ```

  <h4 style=text-align:center>*For Infra*</h4>
- Copy respective project config and context.xml's and run.

   ```
   mvn clean package -Dprofile=appender -P profile 
   Example : mvn clean package -Dprofile=-pilot -P cug
   ```
