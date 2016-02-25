# portlet-xml-generator-maven-plugin

Maven plugin to create configuration XML file for portlet projects.

This plugin will create all configuration files based on annotations found in portlet classes.

The initial support is default portlet.xml and Liferay 6.2.0 portlet.

### Usage

Add the _dependency_:
```xml
<dependency>
    <groupId>com.rapatao.projects</groupId>
    <artifactId>portlet-xml-generator-annotations</artifactId>
    <version>1.0.0-SNAPSHOT</version>
</dependency>
```

Configure the _plugin_:
```xml
<plugin>
    <groupId>com.rapatao.projects</groupId>
    <artifactId>portlet-xml-generator-source-generator</artifactId>
    <version>1.0.0-SNAPSHOT</version>
    <executions>
        <execution>
            <goals>
                <goal>generate</goal>
            </goals>
        </execution>
    </executions>
</plugin>
```

# Example

To use the plugin, you need to annotate you portlet class. 
```java
...
import com.rapatao.projects.portletxmlgenerator.annotations.PortletDefinition;
import com.rapatao.projects.portletxmlgenerator.annotations.PortletInfo;
import com.rapatao.projects.portletxmlgenerator.annotations.support.LiferayPortlet;
...
@PortletDefinition(
        name = "home-portlet",
        portletClass = HomePortlet.class,
        info = @PortletInfo(title = "Home Portlet"))
@LiferayPortlet(groupName = "Plugin Configuration Example")
public class HomePortlet extends GenericPortlet {
...
```
