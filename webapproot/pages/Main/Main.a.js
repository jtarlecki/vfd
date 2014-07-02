dojo.declare("Main", wm.Page, {
_pageTitle: "Main",
start: function() {
this.buttonBack.setShowing(false);
this.spacer1.setShowing(false);
},
"preferredDevice": "phone",
list1Select: function(inSender, inItem) {
var i = inSender.getSelectedIndex() + 1;
if (i==1)
{
this.navLayer2.update();
}
else if (i==2)
{
this.navLayer3.update();
}
else if (i==3)
{
this.navLayer4.update();
}
else if (i==4)
{
this.navLayer5.update();
}
else
{
alert("wtf");
}
this.buttonBack.setShowing(true);
this.spacer1.setShowing(true);
},
listStatesSelect: function(inSender, inItem) {
this.navLayerSLA1_1.update();
},
layer1Show: function(inSender) {
//alert('layer 1 is now showing');
this.buttonBack.setShowing(false);
this.spacer1.setShowing(false);
this.list1.deselectAll();
},
iconMailtoClick: function(inSender) {
//var daReferrer = document.referrer;
//var errorMsg = "here here here is the error error error error";
//var body_message = "%0D%0D%0D%0DThank you "+name+" for submitting this error to us. Please tell us in the space above, what you were doing when the error occurred.%0D%0DReferring Page: "+daReferrer+" %0D%0DException Error Message:%0D-------------------------------------------%0D"+errorMsg;
var email = "jtarlecki@realwinwin.com";
var subject = "[Rebate Access] VFD Mobile App";
var body_message = 'Dear Rebate Access,%0D%0DThis mobile app is fantasitc! However, I have a few more questions that were left unanswered:%0D%0D';
var mailto_link = 'mailto:'+email+'?subject='+subject+'&body='+body_message;
win = window.open(mailto_link,'emailWindow');
if (win && win.open &&!win.closed) win.close();
//app.toastInfo("<img src='resources/images/PNGicons/10-medical.png'>", 12000);
},
iconHomeClick: function(inSender) {
this.pageContainer3.forceReloadPage();
this.pageContainer4.forceReloadPage();
this.layer1.activate();
},
buttonBackClick1: function(inSender) {
if (this.layer4.isActive())
{
//input equip info page
var l1 = this.pageContainer4.widgets.layoutBox1.widgets.layers1.widgets.client.widgets.layer1;
var l2 = this.pageContainer4.widgets.layoutBox1.widgets.layers1.widgets.client.widgets.layer2;
if (l2.isActive())
{
var m = l2.widgets.pageContainer1.widgets.layoutBox1.widgets.layers1.widgets.client.widgets.layer1.isActive();
if (m)
{
//alert('we are in InputTechnology');
l1.activate();
}
else
{
//alert('we are in RebateFeedback');
this.app._onBack();
}
}
else
{
//alert('we are in ZipInput3');
this.layer1.activate();
}
}
else
{
this.app._onBack();
}
},
iconSettingsClick1: function(inSender) {
//app.toastPosition = "cc";
app.toastInfo("<b>About RealWinwin:</b></br></br> We are a team of young, motivated professionals who believe sustainable energy is our future.  There is a long road to travel, but by tapping into our most accessible resource, we can get there.  You.  Solar, wind, and biofuels are a long way off, but you are right here, right now.  When we write you a check for selling or buying more efficient equipment, we are helping your bottom line and taking a step towards sustainability.  It’s not always easy, but we love what we do because it’s the right thing to do.  Together we can save money and reduce carbon emissions.");
},
_end: 0
});

Main.widgets = {
variableSLA: ["wm.Variable", {"isList":true,"json":"[{\"name\":\"SLA-1\",\"dataValue\":1},{\"name\":\"SLA-2\",\"dataValue\":2},{\"name\":\"SLA-3\",\"dataValue\":3},{\"name\":\"SLA-4\",\"dataValue\":4}]","type":"EntryData"}, {}],
navLayer2: ["wm.NavigationCall", {}, {}, {
input: ["wm.ServiceInput", {"type":"gotoLayerInputs"}, {}, {
binding: ["wm.Binding", {}, {}, {
wire: ["wm.Wire", {"expression":undefined,"source":"layer2","targetProperty":"layer"}, {}]
}]
}]
}],
navLayer3: ["wm.NavigationCall", {}, {}, {
input: ["wm.ServiceInput", {"type":"gotoLayerInputs"}, {}, {
binding: ["wm.Binding", {}, {}, {
wire: ["wm.Wire", {"expression":undefined,"source":"layer3","targetProperty":"layer"}, {}]
}]
}]
}],
navLayer4: ["wm.NavigationCall", {}, {}, {
input: ["wm.ServiceInput", {"type":"gotoLayerInputs"}, {}, {
binding: ["wm.Binding", {}, {}, {
wire: ["wm.Wire", {"expression":undefined,"source":"layer4","targetProperty":"layer"}, {}]
}]
}]
}],
navLayer5: ["wm.NavigationCall", {}, {}, {
input: ["wm.ServiceInput", {"type":"gotoLayerInputs"}, {}, {
binding: ["wm.Binding", {}, {}, {
wire: ["wm.Wire", {"expression":undefined,"source":"layer5","targetProperty":"layer"}, {}],
wire1: ["wm.Wire", {"expression":"\"_ComingSoon\"","targetProperty":"pageName"}, {}],
wire2: ["wm.Wire", {"expression":undefined,"source":"pageContainer5","targetProperty":"pageContainer"}, {}]
}]
}]
}],
navBackHome: ["wm.NavigationCall", {}, {}, {
input: ["wm.ServiceInput", {"type":"gotoLayerInputs"}, {}, {
binding: ["wm.Binding", {}, {}, {
wire: ["wm.Wire", {"expression":undefined,"source":"layer1","targetProperty":"layer"}, {}]
}]
}]
}],
statesLiveVariable1: ["wm.LiveVariable", {"ignoreCase":true,"matchMode":"anywhere","refireOnDbChange":true,"type":"com.rebateprograms.data.States"}, {}, {
binding: ["wm.Binding", {}, {}, {
wire: ["wm.Wire", {"expression":undefined,"source":"textState.dataValue","targetProperty":"filter.abbr"}, {}],
wire1: ["wm.Wire", {"expression":"1","targetProperty":"filter.grade"}, {}]
}],
liveView: ["wm.LiveView", {"dataType":"com.rebateprograms.data.States","view":[{"caption":"Id","sortable":true,"dataIndex":"id","type":"java.lang.Integer","displayType":"Number","required":true,"readonly":true,"includeLists":true,"includeForms":true,"order":0,"subType":null},{"caption":"Abbr","sortable":true,"dataIndex":"abbr","type":"java.lang.String","displayType":"Text","required":true,"readonly":false,"includeLists":true,"includeForms":true,"order":1,"subType":null},{"caption":"Name","sortable":true,"dataIndex":"name","type":"java.lang.String","displayType":"Text","required":true,"readonly":false,"includeLists":true,"includeForms":true,"order":2,"subType":null},{"caption":"EmployeeId","sortable":true,"dataIndex":"employeeId","type":"java.lang.Integer","displayType":"Number","required":true,"readonly":false,"includeLists":true,"includeForms":true,"order":3,"subType":null},{"caption":"Grade","sortable":true,"dataIndex":"grade","type":"java.lang.Integer","displayType":"Number","required":true,"readonly":false,"includeLists":true,"includeForms":true,"order":4,"subType":null},{"caption":"ModifiedUser","sortable":true,"dataIndex":"modifiedUser","type":"java.lang.String","displayType":"Text","required":true,"readonly":false,"includeLists":true,"includeForms":true,"order":5,"subType":null},{"caption":"ModifiedDate","sortable":true,"dataIndex":"modifiedDate","type":"java.util.Date","displayType":"Date","required":true,"readonly":false,"includeLists":true,"includeForms":true,"order":6,"subType":null}]}, {}]
}],
slasLiveVariable1: ["wm.LiveVariable", {"type":"com.rebateprograms.data.Slas"}, {}, {
liveView: ["wm.LiveView", {"dataType":"com.rebateprograms.data.Slas","view":[{"caption":"Id","sortable":true,"dataIndex":"id","type":"java.lang.Integer","displayType":"Number","required":true,"readonly":true,"includeLists":true,"includeForms":true,"order":0,"subType":null},{"caption":"Name","sortable":true,"dataIndex":"name","type":"java.lang.String","displayType":"Text","required":true,"readonly":false,"includeLists":true,"includeForms":true,"order":1,"subType":null},{"caption":"Code","sortable":true,"dataIndex":"code","type":"java.lang.String","displayType":"Text","required":true,"readonly":false,"includeLists":true,"includeForms":true,"order":2,"subType":null},{"caption":"Description","sortable":true,"dataIndex":"description","type":"java.lang.String","displayType":"Text","required":false,"readonly":false,"includeLists":true,"includeForms":true,"order":3,"subType":null},{"caption":"CreatedUser","sortable":true,"dataIndex":"createdUser","type":"java.lang.String","displayType":"Text","required":true,"readonly":false,"includeLists":true,"includeForms":true,"order":4,"subType":null},{"caption":"CreatedDate","sortable":true,"dataIndex":"createdDate","type":"java.util.Date","displayType":"Date","required":true,"readonly":false,"includeLists":true,"includeForms":true,"order":5,"subType":null},{"caption":"ModifiedUser","sortable":true,"dataIndex":"modifiedUser","type":"java.lang.String","displayType":"Text","required":true,"readonly":false,"includeLists":true,"includeForms":true,"order":6,"subType":null},{"caption":"ModifiedDate","sortable":true,"dataIndex":"modifiedDate","type":"java.util.Date","displayType":"Date","required":true,"readonly":false,"includeLists":true,"includeForms":true,"order":7,"subType":null}]}, {}]
}],
serviceVariableGetRebateProgramCountByStateAndTechCat: ["wm.ServiceVariable", {"inFlightBehavior":"executeLast","operation":"getRebateProgramCountByStateAndTechCat","service":"RebatePrograms"}, {}, {
input: ["wm.ServiceInput", {"type":"getRebateProgramCountByStateAndTechCatInputs"}, {}, {
binding: ["wm.Binding", {}, {}, {
wire: ["wm.Wire", {"expression":undefined,"source":"listStates.selectedItem.id","targetProperty":"stateid"}, {}]
}]
}]
}],
navLayerSLA1_1: ["wm.NavigationCall", {}, {}, {
input: ["wm.ServiceInput", {"type":"gotoLayerInputs"}, {}, {
binding: ["wm.Binding", {}, {}, {
wire: ["wm.Wire", {"expression":undefined,"source":"layerSLA1_1","targetProperty":"layer"}, {}]
}]
}]
}],
layoutBox1: ["wm.Layout", {"_classes":{"domNode":["rwwBlue"]},"horizontalAlign":"left","verticalAlign":"top"}, {}, {
labelHeaderPanel: ["wm.Panel", {"desktopHeight":"38px","enableTouchHeight":true,"height":"40px","horizontalAlign":"center","layoutKind":"left-to-right","mobileHeight":"40px","styles":{"backgroundColor":"#000000","color":"#000000"},"verticalAlign":"top","width":"100%"}, {}, {
buttonBack: ["wm.Button", {"caption":"< Back","height":"40px","imageIndex":35,"imageList":undefined,"margin":"4","styles":{"backgroundColor":"#000000","fontWeight":"normal","color":"#ffffff","fontSize":"9px"},"width":"25%"}, {"onclick":"buttonBackClick1"}],
iconBack: ["wm.Picture", {"height":"32px","imageIndex":4,"imageList":"imageList1","link":undefined,"showing":false,"source":"resources/images/jay/leftarrow32.png","width":"25%"}, {"onclick":"layer1"}],
labelHeader: ["wm.Label", {"caption":"Rebate Access","height":"38px","padding":"4","styles":{"backgroundColor":"#000000","fontSize":"16px","fontWeight":"bold","color":"#ffffff","textAlign":"center"},"width":"50%"}, {}],
spacer1: ["wm.Spacer", {"height":"100%","width":"25%"}, {}]
}],
layers1: ["wm.Layers", {"margin":"3,0,0,0"}, {}, {
layer1: ["wm.Layer", {"borderColor":"","caption":"layer1","horizontalAlign":"left","themeStyleType":"","verticalAlign":"top"}, {"onShow":"layer1Show"}, {
labelSubheaderOpener: ["wm.Label", {"caption":"Select Service","height":"34px","padding":"4","styles":{"fontWeight":"bold","fontSize":"16px","textAlign":"center"},"width":"100%"}, {}],
list1: ["wm.List", {"_classes":{"domNode":["MobileListStyle"]},"border":"0","borderColor":"","columns":[{"show":false,"field":"PHONE COLUMN","title":"-","width":"100%","align":"left","editorProps":{"restrictValues":true},"expression":"","mobileColumn":false},{"show":true,"field":"name","title":"Name","width":"100%","align":"left","formatFunc":"","editorProps":null,"mobileColumn":true},{"show":true,"field":"picture","title":"Picture","width":"100%","align":"left","formatFunc":"wm_image_formatter","editorProps":{"restrictValues":true},"expression":"if (${id} > 1) \n{\n'resources/images/PNGicons/54-lock.png';\n}\nelse\n{\n'resources/images/jay/00-empty.gif';\n}","isCustomField":true,"mobileColumn":true},{"show":false,"field":"id","title":"Id","width":"80px","align":"left","formatFunc":"","mobileColumn":false},{"show":false,"field":"code","title":"Code","width":"100%","align":"left","formatFunc":"","mobileColumn":false},{"show":false,"field":"description","title":"Description","width":"100%","align":"left","formatFunc":"","mobileColumn":false},{"show":false,"field":"createdUser","title":"CreatedUser","width":"100%","align":"left","formatFunc":"","mobileColumn":false},{"show":false,"field":"createdDate","title":"CreatedDate","width":"80px","align":"left","formatFunc":"wm_date_formatter","mobileColumn":false},{"show":false,"field":"modifiedUser","title":"ModifiedUser","width":"100%","align":"left","formatFunc":"","mobileColumn":false},{"show":false,"field":"modifiedDate","title":"ModifiedDate","width":"80px","align":"left","formatFunc":"wm_date_formatter","mobileColumn":false},{"show":true,"controller":"rightarrow","width":"20px","title":"-","field":"_rightArrow","mobileColumn":true}],"headerVisible":false,"height":"100%","isNavigationMenu":true,"minDesktopHeight":60,"rightNavArrow":true,"styleAsGrid":false,"styles":{"fontSize":"14px"}}, {"onSelect":"list1Select"}, {
binding: ["wm.Binding", {}, {}, {
wire: ["wm.Wire", {"expression":undefined,"source":"slasLiveVariable1","targetProperty":"dataSet"}, {}]
}]
}]
}],
layer2: ["wm.Layer", {"borderColor":"","caption":"layer2","horizontalAlign":"left","themeStyleType":"","verticalAlign":"top"}, {}, {
pageContainer2: ["wm.PageContainer", {"deferLoad":true,"margin":"4","showing":false}, {}],
textState: ["wm.Text", {"caption":"State","captionSize":"50px","changeOnKey":true,"dataValue":undefined,"desktopHeight":"35px","displayValue":"","height":"35px","styles":{"fontSize":"12px"}}, {"onchange":"statesLiveVariable1"}],
listStates: ["wm.List", {"_classes":{"domNode":["MobileListStyle"]},"border":"0","columns":[{"show":false,"field":"id","title":"Id","width":"80px","align":"left","formatFunc":"","editorProps":{"restrictValues":true},"mobileColumn":false},{"show":true,"field":"abbr","title":"Abbr","width":"100%","align":"left","formatFunc":"","mobileColumn":true},{"show":false,"field":"name","title":"Name","width":"100%","align":"left","formatFunc":"","mobileColumn":false},{"show":false,"field":"employeeId","title":"EmployeeId","width":"80px","align":"left","formatFunc":"","mobileColumn":false},{"show":false,"field":"grade","title":"Grade","width":"80px","align":"left","formatFunc":"","mobileColumn":false},{"show":false,"field":"modifiedUser","title":"ModifiedUser","width":"100%","align":"left","formatFunc":"","mobileColumn":false},{"show":false,"field":"modifiedDate","title":"ModifiedDate","width":"80px","align":"left","formatFunc":"wm_date_formatter","mobileColumn":false},{"show":false,"field":"PHONE COLUMN","title":"-","width":"100%","align":"left","expression":"","mobileColumn":false},{"show":true,"controller":"rightarrow","width":"20px","title":"-","field":"_rightArrow","mobileColumn":true}],"headerVisible":false,"height":"100%","isNavigationMenu":true,"margin":"0","minDesktopHeight":60,"rightNavArrow":true,"styleAsGrid":false,"styles":{"fontSize":"14px"}}, {"onSelect":"listStatesSelect","onSelect1":"serviceVariableGetRebateProgramCountByStateAndTechCat"}, {
binding: ["wm.Binding", {}, {}, {
wire: ["wm.Wire", {"expression":undefined,"source":"statesLiveVariable1","targetProperty":"dataSet"}, {}]
}]
}]
}],
layer3: ["wm.Layer", {"borderColor":"","caption":"layer3","horizontalAlign":"left","themeStyleType":"","verticalAlign":"top"}, {}, {
pageContainer3: ["wm.PageContainer", {"deferLoad":true,"margin":"4","pageName":"ZipInput","subpageEventlist":{},"subpageMethodlist":{},"subpageProplist":{}}, {}]
}],
layer4: ["wm.Layer", {"borderColor":"","caption":"layer4","horizontalAlign":"left","themeStyleType":"ContentPanel","verticalAlign":"top"}, {}, {
pageContainer4: ["wm.PageContainer", {"deferLoad":true,"margin":"4","pageName":"ZipInput3","subpageEventlist":{},"subpageMethodlist":{},"subpageProplist":{}}, {}]
}],
layer5: ["wm.Layer", {"borderColor":"","caption":"layer5","horizontalAlign":"left","themeStyleType":"ContentPanel","verticalAlign":"top"}, {}, {
pageContainer5: ["wm.PageContainer", {"deferLoad":true,"pageName":"_ComingSoon","subpageEventlist":{},"subpageMethodlist":{},"subpageProplist":{}}, {}]
}],
layerSLA1_1: ["wm.Layer", {"borderColor":"","caption":"layer6","horizontalAlign":"left","themeStyleType":"","verticalAlign":"top"}, {}, {
listRebateProgramCounts: ["wm.List", {"_classes":{"domNode":["MobileListStyle"]},"border":"0","columns":[{"show":false,"field":"PHONE COLUMN","title":"-","width":"100%","align":"left","editorProps":{"restrictValues":true},"expression":"","mobileColumn":false},{"show":false,"field":"TechCatAndCount","title":"TechCatAndCount","width":"100%","align":"left","editorProps":{"restrictValues":true},"expression":"${c0.technologyCategoryName} + ' (' + ${c0.rebateProgramCount} + ')';","isCustomField":true,"mobileColumn":false},{"show":true,"field":"dollarimage","title":"Dollarimage","width":"100%","align":"left","formatFunc":"wm_image_formatter","formatProps":null,"editorProps":{"restrictValues":true},"expression":"if (${c0.rebateProgramCount} > 0) \n{\n'resources/images/jay/dollarsign.png';\n}\nelse\n{\n'resources/images/jay/empty.gif';\n}","isCustomField":true,"mobileColumn":true},{"show":false,"field":"c0.stateAbbr","title":"C0.stateAbbr","width":"100%","displayType":"Java.lang.String","align":"left","formatFunc":""},{"show":false,"field":"c0.rebateProgramCount","title":"C0.rebateProgramCount","width":"100%","displayType":"Java.lang.Integer","align":"left","formatFunc":""},{"show":false,"field":"c0.stateId","title":"C0.stateId","width":"100%","displayType":"Java.lang.Integer","align":"left","formatFunc":""},{"show":false,"field":"c0.technologyCategoryId","title":"C0.technologyCategoryId","width":"100%","displayType":"Java.lang.Integer","align":"left","formatFunc":""},{"show":false,"field":"c0.technologyCategoryName","title":"C0.technologyCategoryName","width":"100%","displayType":"Java.lang.String","align":"left","formatFunc":""}],"headerVisible":false,"height":"100%","margin":"0","minDesktopHeight":60,"selectionMode":"none","styleAsGrid":false,"styles":{"fontSize":"14px"}}, {}, {
binding: ["wm.Binding", {}, {}, {
wire: ["wm.Wire", {"expression":undefined,"source":"serviceVariableGetRebateProgramCountByStateAndTechCat","targetProperty":"dataSet"}, {}]
}]
}]
}]
}],
FooterPanel: ["wm.Panel", {"height":"48px","horizontalAlign":"left","styles":{"backgroundColor":"#000000"},"verticalAlign":"top","width":"100%"}, {}, {
navButtonPanel: ["wm.Panel", {"height":"100%","horizontalAlign":"center","layoutKind":"left-to-right","verticalAlign":"middle","width":"100%"}, {}, {
iconHome: ["wm.Picture", {"height":"25px","imageIndex":4,"imageList":"imageList1","link":undefined,"source":"resources/images/jay/53-house.png","width":"25%"}, {"onclick":"iconHomeClick"}],
iconFav: ["wm.Picture", {"height":"25px","imageIndex":4,"imageList":"imageList1","link":undefined,"source":"resources/images/jay/29-heart.png","width":"25%"}, {"onclick":"app.pageDialogSocialMedia.show"}],
iconMailto: ["wm.Picture", {"height":"20px","imageIndex":4,"imageList":"imageList1","link":undefined,"source":"resources/images/jay/18-envelope.png","width":"25%"}, {"onclick":"iconMailtoClick"}],
iconSettings: ["wm.Picture", {"height":"20px","imageIndex":4,"imageList":"imageList1","link":undefined,"source":"resources/images/jay/84-lightbulb.png","width":"25%"}, {"onclick1":"iconSettingsClick1"}],
labelFooter: ["wm.Label", {"caption":"Powered By RealWinWin","height":"15px","padding":"4","showing":false,"styles":{"backgroundColor":"#000000","fontSize":"12px","fontWeight":"bold","color":"#ffffff","textAlign":"center"},"width":"100%"}, {}]
}]
}]
}]
};

Main.prototype._cssText = '';
Main.prototype._htmlText = '';