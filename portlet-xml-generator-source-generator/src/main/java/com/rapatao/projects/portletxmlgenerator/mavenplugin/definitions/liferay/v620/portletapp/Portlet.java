
package com.rapatao.projects.portletxmlgenerator.mavenplugin.definitions.liferay.v620.portletapp;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "portletName",
    "icon",
    "virtualPath",
    "strutsPath",
    "parentStrutsPath",
    "configurationPath",
    "configurationActionClass",
    "indexerClass",
    "openSearchClass",
    "schedulerEntry",
    "portletUrlClass",
    "friendlyUrlMapperClass",
    "friendlyUrlMapping",
    "friendlyUrlRoutes",
    "urlEncoderClass",
    "portletDataHandlerClass",
    "stagedModelDataHandlerClass",
    "templateHandler",
    "portletLayoutListenerClass",
    "pollerProcessorClass",
    "popMessageListenerClass",
    "socialActivityInterpreterClass",
    "socialRequestInterpreterClass",
    "userNotificationDefinitions",
    "userNotificationHandlerClass",
    "webdavStorageToken",
    "webdavStorageClass",
    "xmlRpcMethodClass",
    "controlPanelEntryCategory",
    "controlPanelEntryWeight",
    "controlPanelEntryClass",
    "assetRendererFactory",
    "atomCollectionAdapter",
    "customAttributesDisplay",
    "ddmDisplay",
    "permissionPropagator",
    "trashHandler",
    "workflowHandler",
    "preferencesCompanyWide",
    "preferencesUniquePerLayout",
    "preferencesOwnedByGroup",
    "useDefaultTemplate",
    "showPortletAccessDenied",
    "showPortletInactive",
    "actionUrlRedirect",
    "restoreCurrentView",
    "maximizeEdit",
    "maximizeHelp",
    "popUpPrint",
    "layoutCacheable",
    "instanceable",
    "remoteable",
    "scopeable",
    "userPrincipalStrategy",
    "privateRequestAttributes",
    "privateSessionAttributes",
    "autopropagatedParameters",
    "requiresNamespacedParameters",
    "actionTimeout",
    "renderTimeout",
    "renderWeight",
    "ajaxable",
    "headerPortalCss",
    "headerPortletCss",
    "headerPortalJavascript",
    "headerPortletJavascript",
    "footerPortalCss",
    "footerPortletCss",
    "footerPortalJavascript",
    "footerPortletJavascript",
    "cssClassWrapper",
    "facebookIntegration",
    "addDefaultResource",
    "system",
    "active",
    "include"
})
@XmlRootElement(name = "portlet")
public class Portlet {

    @XmlElement(name = "portlet-name", required = true)
    protected String portletName;
    protected String icon;
    @XmlElement(name = "virtual-path")
    protected String virtualPath;
    @XmlElement(name = "struts-path")
    protected String strutsPath;
    @XmlElement(name = "parent-struts-path")
    protected String parentStrutsPath;
    @XmlElement(name = "configuration-path")
    protected String configurationPath;
    @XmlElement(name = "configuration-action-class")
    protected String configurationActionClass;
    @XmlElement(name = "indexer-class")
    protected List<IndexerClass> indexerClass;
    @XmlElement(name = "open-search-class")
    protected String openSearchClass;
    @XmlElement(name = "scheduler-entry")
    protected List<SchedulerEntry> schedulerEntry;
    @XmlElement(name = "portlet-url-class")
    protected String portletUrlClass;
    @XmlElement(name = "friendly-url-mapper-class")
    protected String friendlyUrlMapperClass;
    @XmlElement(name = "friendly-url-mapping")
    protected String friendlyUrlMapping;
    @XmlElement(name = "friendly-url-routes")
    protected String friendlyUrlRoutes;
    @XmlElement(name = "url-encoder-class")
    protected String urlEncoderClass;
    @XmlElement(name = "portlet-data-handler-class")
    protected String portletDataHandlerClass;
    @XmlElement(name = "staged-model-data-handler-class")
    protected List<StagedModelDataHandlerClass> stagedModelDataHandlerClass;
    @XmlElement(name = "template-handler")
    protected String templateHandler;
    @XmlElement(name = "portlet-layout-listener-class")
    protected String portletLayoutListenerClass;
    @XmlElement(name = "poller-processor-class")
    protected String pollerProcessorClass;
    @XmlElement(name = "pop-message-listener-class")
    protected String popMessageListenerClass;
    @XmlElement(name = "social-activity-interpreter-class")
    protected List<SocialActivityInterpreterClass> socialActivityInterpreterClass;
    @XmlElement(name = "social-request-interpreter-class")
    protected String socialRequestInterpreterClass;
    @XmlElement(name = "user-notification-definitions")
    protected String userNotificationDefinitions;
    @XmlElement(name = "user-notification-handler-class")
    protected List<UserNotificationHandlerClass> userNotificationHandlerClass;
    @XmlElement(name = "webdav-storage-token")
    protected String webdavStorageToken;
    @XmlElement(name = "webdav-storage-class")
    protected String webdavStorageClass;
    @XmlElement(name = "xml-rpc-method-class")
    protected String xmlRpcMethodClass;
    @XmlElement(name = "control-panel-entry-category")
    protected String controlPanelEntryCategory;
    @XmlElement(name = "control-panel-entry-weight")
    protected String controlPanelEntryWeight;
    @XmlElement(name = "control-panel-entry-class")
    protected String controlPanelEntryClass;
    @XmlElement(name = "asset-renderer-factory")
    protected List<AssetRendererFactory> assetRendererFactory;
    @XmlElement(name = "atom-collection-adapter")
    protected List<AtomCollectionAdapter> atomCollectionAdapter;
    @XmlElement(name = "custom-attributes-display")
    protected List<CustomAttributesDisplay> customAttributesDisplay;
    @XmlElement(name = "ddm-display")
    protected String ddmDisplay;
    @XmlElement(name = "permission-propagator")
    protected String permissionPropagator;
    @XmlElement(name = "trash-handler")
    protected List<TrashHandler> trashHandler;
    @XmlElement(name = "workflow-handler")
    protected List<WorkflowHandler> workflowHandler;
    @XmlElement(name = "preferences-company-wide")
    protected String preferencesCompanyWide;
    @XmlElement(name = "preferences-unique-per-layout")
    protected String preferencesUniquePerLayout;
    @XmlElement(name = "preferences-owned-by-group")
    protected String preferencesOwnedByGroup;
    @XmlElement(name = "use-default-template")
    protected String useDefaultTemplate;
    @XmlElement(name = "show-portlet-access-denied")
    protected String showPortletAccessDenied;
    @XmlElement(name = "show-portlet-inactive")
    protected String showPortletInactive;
    @XmlElement(name = "action-url-redirect")
    protected String actionUrlRedirect;
    @XmlElement(name = "restore-current-view")
    protected String restoreCurrentView;
    @XmlElement(name = "maximize-edit")
    protected String maximizeEdit;
    @XmlElement(name = "maximize-help")
    protected String maximizeHelp;
    @XmlElement(name = "pop-up-print")
    protected String popUpPrint;
    @XmlElement(name = "layout-cacheable")
    protected String layoutCacheable;
    protected String instanceable;
    protected String remoteable;
    protected String scopeable;
    @XmlElement(name = "user-principal-strategy")
    protected String userPrincipalStrategy;
    @XmlElement(name = "private-request-attributes")
    protected String privateRequestAttributes;
    @XmlElement(name = "private-session-attributes")
    protected String privateSessionAttributes;
    @XmlElement(name = "autopropagated-parameters")
    protected String autopropagatedParameters;
    @XmlElement(name = "requires-namespaced-parameters")
    protected String requiresNamespacedParameters;
    @XmlElement(name = "action-timeout")
    protected String actionTimeout;
    @XmlElement(name = "render-timeout")
    protected String renderTimeout;
    @XmlElement(name = "render-weight")
    protected String renderWeight;
    protected String ajaxable;
    @XmlElement(name = "header-portal-css")
    protected List<HeaderPortalCss> headerPortalCss;
    @XmlElement(name = "header-portlet-css")
    protected List<HeaderPortletCss> headerPortletCss;
    @XmlElement(name = "header-portal-javascript")
    protected List<HeaderPortalJavascript> headerPortalJavascript;
    @XmlElement(name = "header-portlet-javascript")
    protected List<HeaderPortletJavascript> headerPortletJavascript;
    @XmlElement(name = "footer-portal-css")
    protected List<FooterPortalCss> footerPortalCss;
    @XmlElement(name = "footer-portlet-css")
    protected List<FooterPortletCss> footerPortletCss;
    @XmlElement(name = "footer-portal-javascript")
    protected List<FooterPortalJavascript> footerPortalJavascript;
    @XmlElement(name = "footer-portlet-javascript")
    protected List<FooterPortletJavascript> footerPortletJavascript;
    @XmlElement(name = "css-class-wrapper")
    protected String cssClassWrapper;
    @XmlElement(name = "facebook-integration")
    protected String facebookIntegration;
    @XmlElement(name = "add-default-resource")
    protected String addDefaultResource;
    protected String system;
    protected String active;
    protected String include;

    /**
     * Gets the value of the portletName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortletName() {
        return portletName;
    }

    /**
     * Sets the value of the portletName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortletName(String value) {
        this.portletName = value;
    }

    /**
     * Gets the value of the icon property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcon() {
        return icon;
    }

    /**
     * Sets the value of the icon property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcon(String value) {
        this.icon = value;
    }

    /**
     * Gets the value of the virtualPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVirtualPath() {
        return virtualPath;
    }

    /**
     * Sets the value of the virtualPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVirtualPath(String value) {
        this.virtualPath = value;
    }

    /**
     * Gets the value of the strutsPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStrutsPath() {
        return strutsPath;
    }

    /**
     * Sets the value of the strutsPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStrutsPath(String value) {
        this.strutsPath = value;
    }

    /**
     * Gets the value of the parentStrutsPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParentStrutsPath() {
        return parentStrutsPath;
    }

    /**
     * Sets the value of the parentStrutsPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParentStrutsPath(String value) {
        this.parentStrutsPath = value;
    }

    /**
     * Gets the value of the configurationPath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigurationPath() {
        return configurationPath;
    }

    /**
     * Sets the value of the configurationPath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigurationPath(String value) {
        this.configurationPath = value;
    }

    /**
     * Gets the value of the configurationActionClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigurationActionClass() {
        return configurationActionClass;
    }

    /**
     * Sets the value of the configurationActionClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigurationActionClass(String value) {
        this.configurationActionClass = value;
    }

    /**
     * Gets the value of the indexerClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indexerClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndexerClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IndexerClass }
     * 
     * 
     */
    public List<IndexerClass> getIndexerClass() {
        if (indexerClass == null) {
            indexerClass = new ArrayList<IndexerClass>();
        }
        return this.indexerClass;
    }

    /**
     * Gets the value of the openSearchClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenSearchClass() {
        return openSearchClass;
    }

    /**
     * Sets the value of the openSearchClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenSearchClass(String value) {
        this.openSearchClass = value;
    }

    /**
     * Gets the value of the schedulerEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the schedulerEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSchedulerEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SchedulerEntry }
     * 
     * 
     */
    public List<SchedulerEntry> getSchedulerEntry() {
        if (schedulerEntry == null) {
            schedulerEntry = new ArrayList<SchedulerEntry>();
        }
        return this.schedulerEntry;
    }

    /**
     * Gets the value of the portletUrlClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortletUrlClass() {
        return portletUrlClass;
    }

    /**
     * Sets the value of the portletUrlClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortletUrlClass(String value) {
        this.portletUrlClass = value;
    }

    /**
     * Gets the value of the friendlyUrlMapperClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFriendlyUrlMapperClass() {
        return friendlyUrlMapperClass;
    }

    /**
     * Sets the value of the friendlyUrlMapperClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFriendlyUrlMapperClass(String value) {
        this.friendlyUrlMapperClass = value;
    }

    /**
     * Gets the value of the friendlyUrlMapping property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFriendlyUrlMapping() {
        return friendlyUrlMapping;
    }

    /**
     * Sets the value of the friendlyUrlMapping property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFriendlyUrlMapping(String value) {
        this.friendlyUrlMapping = value;
    }

    /**
     * Gets the value of the friendlyUrlRoutes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFriendlyUrlRoutes() {
        return friendlyUrlRoutes;
    }

    /**
     * Sets the value of the friendlyUrlRoutes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFriendlyUrlRoutes(String value) {
        this.friendlyUrlRoutes = value;
    }

    /**
     * Gets the value of the urlEncoderClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrlEncoderClass() {
        return urlEncoderClass;
    }

    /**
     * Sets the value of the urlEncoderClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrlEncoderClass(String value) {
        this.urlEncoderClass = value;
    }

    /**
     * Gets the value of the portletDataHandlerClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortletDataHandlerClass() {
        return portletDataHandlerClass;
    }

    /**
     * Sets the value of the portletDataHandlerClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortletDataHandlerClass(String value) {
        this.portletDataHandlerClass = value;
    }

    /**
     * Gets the value of the stagedModelDataHandlerClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stagedModelDataHandlerClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStagedModelDataHandlerClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StagedModelDataHandlerClass }
     * 
     * 
     */
    public List<StagedModelDataHandlerClass> getStagedModelDataHandlerClass() {
        if (stagedModelDataHandlerClass == null) {
            stagedModelDataHandlerClass = new ArrayList<StagedModelDataHandlerClass>();
        }
        return this.stagedModelDataHandlerClass;
    }

    /**
     * Gets the value of the templateHandler property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTemplateHandler() {
        return templateHandler;
    }

    /**
     * Sets the value of the templateHandler property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTemplateHandler(String value) {
        this.templateHandler = value;
    }

    /**
     * Gets the value of the portletLayoutListenerClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPortletLayoutListenerClass() {
        return portletLayoutListenerClass;
    }

    /**
     * Sets the value of the portletLayoutListenerClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPortletLayoutListenerClass(String value) {
        this.portletLayoutListenerClass = value;
    }

    /**
     * Gets the value of the pollerProcessorClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPollerProcessorClass() {
        return pollerProcessorClass;
    }

    /**
     * Sets the value of the pollerProcessorClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPollerProcessorClass(String value) {
        this.pollerProcessorClass = value;
    }

    /**
     * Gets the value of the popMessageListenerClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPopMessageListenerClass() {
        return popMessageListenerClass;
    }

    /**
     * Sets the value of the popMessageListenerClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPopMessageListenerClass(String value) {
        this.popMessageListenerClass = value;
    }

    /**
     * Gets the value of the socialActivityInterpreterClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the socialActivityInterpreterClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSocialActivityInterpreterClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SocialActivityInterpreterClass }
     * 
     * 
     */
    public List<SocialActivityInterpreterClass> getSocialActivityInterpreterClass() {
        if (socialActivityInterpreterClass == null) {
            socialActivityInterpreterClass = new ArrayList<SocialActivityInterpreterClass>();
        }
        return this.socialActivityInterpreterClass;
    }

    /**
     * Gets the value of the socialRequestInterpreterClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSocialRequestInterpreterClass() {
        return socialRequestInterpreterClass;
    }

    /**
     * Sets the value of the socialRequestInterpreterClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSocialRequestInterpreterClass(String value) {
        this.socialRequestInterpreterClass = value;
    }

    /**
     * Gets the value of the userNotificationDefinitions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserNotificationDefinitions() {
        return userNotificationDefinitions;
    }

    /**
     * Sets the value of the userNotificationDefinitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserNotificationDefinitions(String value) {
        this.userNotificationDefinitions = value;
    }

    /**
     * Gets the value of the userNotificationHandlerClass property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userNotificationHandlerClass property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserNotificationHandlerClass().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserNotificationHandlerClass }
     * 
     * 
     */
    public List<UserNotificationHandlerClass> getUserNotificationHandlerClass() {
        if (userNotificationHandlerClass == null) {
            userNotificationHandlerClass = new ArrayList<UserNotificationHandlerClass>();
        }
        return this.userNotificationHandlerClass;
    }

    /**
     * Gets the value of the webdavStorageToken property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebdavStorageToken() {
        return webdavStorageToken;
    }

    /**
     * Sets the value of the webdavStorageToken property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebdavStorageToken(String value) {
        this.webdavStorageToken = value;
    }

    /**
     * Gets the value of the webdavStorageClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebdavStorageClass() {
        return webdavStorageClass;
    }

    /**
     * Sets the value of the webdavStorageClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebdavStorageClass(String value) {
        this.webdavStorageClass = value;
    }

    /**
     * Gets the value of the xmlRpcMethodClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXmlRpcMethodClass() {
        return xmlRpcMethodClass;
    }

    /**
     * Sets the value of the xmlRpcMethodClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXmlRpcMethodClass(String value) {
        this.xmlRpcMethodClass = value;
    }

    /**
     * Gets the value of the controlPanelEntryCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlPanelEntryCategory() {
        return controlPanelEntryCategory;
    }

    /**
     * Sets the value of the controlPanelEntryCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlPanelEntryCategory(String value) {
        this.controlPanelEntryCategory = value;
    }

    /**
     * Gets the value of the controlPanelEntryWeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlPanelEntryWeight() {
        return controlPanelEntryWeight;
    }

    /**
     * Sets the value of the controlPanelEntryWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlPanelEntryWeight(String value) {
        this.controlPanelEntryWeight = value;
    }

    /**
     * Gets the value of the controlPanelEntryClass property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getControlPanelEntryClass() {
        return controlPanelEntryClass;
    }

    /**
     * Sets the value of the controlPanelEntryClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setControlPanelEntryClass(String value) {
        this.controlPanelEntryClass = value;
    }

    /**
     * Gets the value of the assetRendererFactory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assetRendererFactory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssetRendererFactory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssetRendererFactory }
     * 
     * 
     */
    public List<AssetRendererFactory> getAssetRendererFactory() {
        if (assetRendererFactory == null) {
            assetRendererFactory = new ArrayList<AssetRendererFactory>();
        }
        return this.assetRendererFactory;
    }

    /**
     * Gets the value of the atomCollectionAdapter property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the atomCollectionAdapter property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAtomCollectionAdapter().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AtomCollectionAdapter }
     * 
     * 
     */
    public List<AtomCollectionAdapter> getAtomCollectionAdapter() {
        if (atomCollectionAdapter == null) {
            atomCollectionAdapter = new ArrayList<AtomCollectionAdapter>();
        }
        return this.atomCollectionAdapter;
    }

    /**
     * Gets the value of the customAttributesDisplay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the customAttributesDisplay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustomAttributesDisplay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomAttributesDisplay }
     * 
     * 
     */
    public List<CustomAttributesDisplay> getCustomAttributesDisplay() {
        if (customAttributesDisplay == null) {
            customAttributesDisplay = new ArrayList<CustomAttributesDisplay>();
        }
        return this.customAttributesDisplay;
    }

    /**
     * Gets the value of the ddmDisplay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDdmDisplay() {
        return ddmDisplay;
    }

    /**
     * Sets the value of the ddmDisplay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDdmDisplay(String value) {
        this.ddmDisplay = value;
    }

    /**
     * Gets the value of the permissionPropagator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPermissionPropagator() {
        return permissionPropagator;
    }

    /**
     * Sets the value of the permissionPropagator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPermissionPropagator(String value) {
        this.permissionPropagator = value;
    }

    /**
     * Gets the value of the trashHandler property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trashHandler property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrashHandler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrashHandler }
     * 
     * 
     */
    public List<TrashHandler> getTrashHandler() {
        if (trashHandler == null) {
            trashHandler = new ArrayList<TrashHandler>();
        }
        return this.trashHandler;
    }

    /**
     * Gets the value of the workflowHandler property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the workflowHandler property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWorkflowHandler().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WorkflowHandler }
     * 
     * 
     */
    public List<WorkflowHandler> getWorkflowHandler() {
        if (workflowHandler == null) {
            workflowHandler = new ArrayList<WorkflowHandler>();
        }
        return this.workflowHandler;
    }

    /**
     * Gets the value of the preferencesCompanyWide property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferencesCompanyWide() {
        return preferencesCompanyWide;
    }

    /**
     * Sets the value of the preferencesCompanyWide property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferencesCompanyWide(String value) {
        this.preferencesCompanyWide = value;
    }

    /**
     * Gets the value of the preferencesUniquePerLayout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferencesUniquePerLayout() {
        return preferencesUniquePerLayout;
    }

    /**
     * Sets the value of the preferencesUniquePerLayout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferencesUniquePerLayout(String value) {
        this.preferencesUniquePerLayout = value;
    }

    /**
     * Gets the value of the preferencesOwnedByGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreferencesOwnedByGroup() {
        return preferencesOwnedByGroup;
    }

    /**
     * Sets the value of the preferencesOwnedByGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreferencesOwnedByGroup(String value) {
        this.preferencesOwnedByGroup = value;
    }

    /**
     * Gets the value of the useDefaultTemplate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUseDefaultTemplate() {
        return useDefaultTemplate;
    }

    /**
     * Sets the value of the useDefaultTemplate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUseDefaultTemplate(String value) {
        this.useDefaultTemplate = value;
    }

    /**
     * Gets the value of the showPortletAccessDenied property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowPortletAccessDenied() {
        return showPortletAccessDenied;
    }

    /**
     * Sets the value of the showPortletAccessDenied property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowPortletAccessDenied(String value) {
        this.showPortletAccessDenied = value;
    }

    /**
     * Gets the value of the showPortletInactive property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowPortletInactive() {
        return showPortletInactive;
    }

    /**
     * Sets the value of the showPortletInactive property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowPortletInactive(String value) {
        this.showPortletInactive = value;
    }

    /**
     * Gets the value of the actionUrlRedirect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionUrlRedirect() {
        return actionUrlRedirect;
    }

    /**
     * Sets the value of the actionUrlRedirect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionUrlRedirect(String value) {
        this.actionUrlRedirect = value;
    }

    /**
     * Gets the value of the restoreCurrentView property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestoreCurrentView() {
        return restoreCurrentView;
    }

    /**
     * Sets the value of the restoreCurrentView property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestoreCurrentView(String value) {
        this.restoreCurrentView = value;
    }

    /**
     * Gets the value of the maximizeEdit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximizeEdit() {
        return maximizeEdit;
    }

    /**
     * Sets the value of the maximizeEdit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximizeEdit(String value) {
        this.maximizeEdit = value;
    }

    /**
     * Gets the value of the maximizeHelp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximizeHelp() {
        return maximizeHelp;
    }

    /**
     * Sets the value of the maximizeHelp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximizeHelp(String value) {
        this.maximizeHelp = value;
    }

    /**
     * Gets the value of the popUpPrint property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPopUpPrint() {
        return popUpPrint;
    }

    /**
     * Sets the value of the popUpPrint property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPopUpPrint(String value) {
        this.popUpPrint = value;
    }

    /**
     * Gets the value of the layoutCacheable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLayoutCacheable() {
        return layoutCacheable;
    }

    /**
     * Sets the value of the layoutCacheable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLayoutCacheable(String value) {
        this.layoutCacheable = value;
    }

    /**
     * Gets the value of the instanceable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstanceable() {
        return instanceable;
    }

    /**
     * Sets the value of the instanceable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstanceable(String value) {
        this.instanceable = value;
    }

    /**
     * Gets the value of the remoteable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteable() {
        return remoteable;
    }

    /**
     * Sets the value of the remoteable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteable(String value) {
        this.remoteable = value;
    }

    /**
     * Gets the value of the scopeable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScopeable() {
        return scopeable;
    }

    /**
     * Sets the value of the scopeable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScopeable(String value) {
        this.scopeable = value;
    }

    /**
     * Gets the value of the userPrincipalStrategy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserPrincipalStrategy() {
        return userPrincipalStrategy;
    }

    /**
     * Sets the value of the userPrincipalStrategy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserPrincipalStrategy(String value) {
        this.userPrincipalStrategy = value;
    }

    /**
     * Gets the value of the privateRequestAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivateRequestAttributes() {
        return privateRequestAttributes;
    }

    /**
     * Sets the value of the privateRequestAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivateRequestAttributes(String value) {
        this.privateRequestAttributes = value;
    }

    /**
     * Gets the value of the privateSessionAttributes property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrivateSessionAttributes() {
        return privateSessionAttributes;
    }

    /**
     * Sets the value of the privateSessionAttributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrivateSessionAttributes(String value) {
        this.privateSessionAttributes = value;
    }

    /**
     * Gets the value of the autopropagatedParameters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutopropagatedParameters() {
        return autopropagatedParameters;
    }

    /**
     * Sets the value of the autopropagatedParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutopropagatedParameters(String value) {
        this.autopropagatedParameters = value;
    }

    /**
     * Gets the value of the requiresNamespacedParameters property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequiresNamespacedParameters() {
        return requiresNamespacedParameters;
    }

    /**
     * Sets the value of the requiresNamespacedParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequiresNamespacedParameters(String value) {
        this.requiresNamespacedParameters = value;
    }

    /**
     * Gets the value of the actionTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActionTimeout() {
        return actionTimeout;
    }

    /**
     * Sets the value of the actionTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActionTimeout(String value) {
        this.actionTimeout = value;
    }

    /**
     * Gets the value of the renderTimeout property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenderTimeout() {
        return renderTimeout;
    }

    /**
     * Sets the value of the renderTimeout property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenderTimeout(String value) {
        this.renderTimeout = value;
    }

    /**
     * Gets the value of the renderWeight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRenderWeight() {
        return renderWeight;
    }

    /**
     * Sets the value of the renderWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRenderWeight(String value) {
        this.renderWeight = value;
    }

    /**
     * Gets the value of the ajaxable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAjaxable() {
        return ajaxable;
    }

    /**
     * Sets the value of the ajaxable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAjaxable(String value) {
        this.ajaxable = value;
    }

    /**
     * Gets the value of the headerPortalCss property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the headerPortalCss property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeaderPortalCss().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HeaderPortalCss }
     * 
     * 
     */
    public List<HeaderPortalCss> getHeaderPortalCss() {
        if (headerPortalCss == null) {
            headerPortalCss = new ArrayList<HeaderPortalCss>();
        }
        return this.headerPortalCss;
    }

    /**
     * Gets the value of the headerPortletCss property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the headerPortletCss property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeaderPortletCss().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HeaderPortletCss }
     * 
     * 
     */
    public List<HeaderPortletCss> getHeaderPortletCss() {
        if (headerPortletCss == null) {
            headerPortletCss = new ArrayList<HeaderPortletCss>();
        }
        return this.headerPortletCss;
    }

    /**
     * Gets the value of the headerPortalJavascript property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the headerPortalJavascript property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeaderPortalJavascript().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HeaderPortalJavascript }
     * 
     * 
     */
    public List<HeaderPortalJavascript> getHeaderPortalJavascript() {
        if (headerPortalJavascript == null) {
            headerPortalJavascript = new ArrayList<HeaderPortalJavascript>();
        }
        return this.headerPortalJavascript;
    }

    /**
     * Gets the value of the headerPortletJavascript property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the headerPortletJavascript property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHeaderPortletJavascript().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HeaderPortletJavascript }
     * 
     * 
     */
    public List<HeaderPortletJavascript> getHeaderPortletJavascript() {
        if (headerPortletJavascript == null) {
            headerPortletJavascript = new ArrayList<HeaderPortletJavascript>();
        }
        return this.headerPortletJavascript;
    }

    /**
     * Gets the value of the footerPortalCss property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the footerPortalCss property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFooterPortalCss().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FooterPortalCss }
     * 
     * 
     */
    public List<FooterPortalCss> getFooterPortalCss() {
        if (footerPortalCss == null) {
            footerPortalCss = new ArrayList<FooterPortalCss>();
        }
        return this.footerPortalCss;
    }

    /**
     * Gets the value of the footerPortletCss property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the footerPortletCss property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFooterPortletCss().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FooterPortletCss }
     * 
     * 
     */
    public List<FooterPortletCss> getFooterPortletCss() {
        if (footerPortletCss == null) {
            footerPortletCss = new ArrayList<FooterPortletCss>();
        }
        return this.footerPortletCss;
    }

    /**
     * Gets the value of the footerPortalJavascript property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the footerPortalJavascript property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFooterPortalJavascript().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FooterPortalJavascript }
     * 
     * 
     */
    public List<FooterPortalJavascript> getFooterPortalJavascript() {
        if (footerPortalJavascript == null) {
            footerPortalJavascript = new ArrayList<FooterPortalJavascript>();
        }
        return this.footerPortalJavascript;
    }

    /**
     * Gets the value of the footerPortletJavascript property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the footerPortletJavascript property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFooterPortletJavascript().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FooterPortletJavascript }
     * 
     * 
     */
    public List<FooterPortletJavascript> getFooterPortletJavascript() {
        if (footerPortletJavascript == null) {
            footerPortletJavascript = new ArrayList<FooterPortletJavascript>();
        }
        return this.footerPortletJavascript;
    }

    /**
     * Gets the value of the cssClassWrapper property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCssClassWrapper() {
        return cssClassWrapper;
    }

    /**
     * Sets the value of the cssClassWrapper property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCssClassWrapper(String value) {
        this.cssClassWrapper = value;
    }

    /**
     * Gets the value of the facebookIntegration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacebookIntegration() {
        return facebookIntegration;
    }

    /**
     * Sets the value of the facebookIntegration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacebookIntegration(String value) {
        this.facebookIntegration = value;
    }

    /**
     * Gets the value of the addDefaultResource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddDefaultResource() {
        return addDefaultResource;
    }

    /**
     * Sets the value of the addDefaultResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddDefaultResource(String value) {
        this.addDefaultResource = value;
    }

    /**
     * Gets the value of the system property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystem() {
        return system;
    }

    /**
     * Sets the value of the system property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystem(String value) {
        this.system = value;
    }

    /**
     * Gets the value of the active property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActive() {
        return active;
    }

    /**
     * Sets the value of the active property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActive(String value) {
        this.active = value;
    }

    /**
     * Gets the value of the include property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInclude() {
        return include;
    }

    /**
     * Sets the value of the include property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInclude(String value) {
        this.include = value;
    }

}
