dojo.declare("ZipInput3", wm.Page, {
start: function() {
},
"preferredDevice": "phone",
textZipChange: function(inSender, inDisplayValue, inDataValue, inSetByCode) {
this.list1Panel.setShowing(false);
},
serviceVariableGetRWWUtilityPayoutsByZipcodeAndEnergytypeSuccess: function(inSender, inDeprecated) {
var cnt  = this.serviceVariableGetRWWUtilityPayoutsByZipcodeAndEnergytype.getCount();
if (cnt > 0)
{
//display list
this.list1Panel.setShowing(true);
//alert(cnt);
}
else
{
app.toastError("No electric utilities found for '" + this.textZip.getDisplayValue() + "'",2000);
}
},
list1Select2: function(inSender, inItem) {
var utility = this.list1.selectedItem.getData();
if (utility.payoutcount > 0)
{
this.layer2.activate();
var selmenus = this.layer2.widgets.pageContainer1.widgets.layoutBox1.widgets.layers1.widgets.client.widgets.layer1.widgets.panel1.widgets;
this.layer2.widgets.pageContainer1.widgets.layoutBox1.widgets.layers1.widgets.client.widgets.layer1.widgets.panel1.clearData();
/*
selmenus.selectMenu1.setDisplayValue("");
selmenus.selectMenu2.setDisplayValue("");
selmenus.selectMenu3.setDisplayValue("");
selmenus.selectMenu4.setDisplayValue("");
*/
}
else
{
app.pageDialogNoRebates.show();
this.list1.deselectAll();
}
},
_end: 0
});

ZipInput3.widgets = {
serviceVariableGetRWWUtilityPayoutsByZipcodeAndEnergytype: ["wm.ServiceVariable", {"inFlightBehavior":"executeLast","operation":"getRWWUtillityPayoutsByZipCodeAndEnergytype","service":"RebatePrograms"}, {"onSuccess":"serviceVariableGetRWWUtilityPayoutsByZipcodeAndEnergytypeSuccess"}, {
input: ["wm.ServiceInput", {"type":"getRWWUtillityPayoutsByZipCodeAndEnergytypeInputs"}, {}, {
binding: ["wm.Binding", {}, {}, {
wire: ["wm.Wire", {"expression":undefined,"source":"textZip.dataValue","targetProperty":"zipcode"}, {}]
}]
}]
}],
layoutBox1: ["wm.Layout", {"horizontalAlign":"left","verticalAlign":"top"}, {}, {
layers1: ["wm.Layers", {}, {}, {
layer1: ["wm.Layer", {"borderColor":"","caption":"layer1","horizontalAlign":"left","themeStyleType":"","verticalAlign":"top"}, {}, {
labelEnterZip: ["wm.Label", {"align":"center","caption":"Enter Zipcode","padding":"4","styles":{"fontWeight":"bold","fontSize":"16px"},"width":"100%"}, {}],
textZip: ["wm.Text", {"caption":undefined,"changeOnKey":true,"dataValue":undefined,"desktopHeight":"35px","displayValue":"","height":"35px","invalidMessage":undefined,"promptMessage":undefined,"width":"100%"}, {"onchange":"textZipChange"}],
button1: ["wm.Button", {"_classes":{"domNode":["rwwGreen"]},"caption":"Submit Zipcode","height":"40px","margin":"4","width":"100%"}, {"onclick":"serviceVariableGetRWWUtilityPayoutsByZipcodeAndEnergytype"}],
list1Panel: ["wm.Panel", {"height":"100%","horizontalAlign":"left","showing":false,"verticalAlign":"top","width":"100%"}, {}, {
labelEnterZip1: ["wm.Label", {"align":"center","caption":"Select Electric Utility","padding":"4","styles":{"fontWeight":"bold","fontSize":"16px"},"width":"100%"}, {}],
list1: ["wm.List", {"_classes":{"domNode":["MobileListStyle"]},"border":"0","columns":[{"show":false,"field":"PHONE COLUMN","title":"-","width":"100%","align":"left","editorProps":{"restrictValues":true},"expression":"","mobileColumn":false},{"show":true,"field":"rwwutilityname","title":"Rwwutilityname","width":"100%","align":"left","formatFunc":"","editorProps":{"restrictValues":true},"mobileColumn":true},{"show":true,"field":"checkprobitimage","title":"Checkprobitimage","width":"100%","align":"left","formatFunc":"wm_image_formatter","editorProps":{"restrictValues":true},"expression":"if (${payoutcount} > 0) \n{\n'resources/images/jay/check32.png';\n}\nelse\n{\n'resources/images/jay/block32.png';\n}","isCustomField":true,"mobileColumn":true},{"show":false,"field":"rwwutilityid","title":"Rwwutilityid","width":"100%","align":"left","formatFunc":"","mobileColumn":false},{"show":false,"field":"sumoverlap","title":"Sumoverlap","width":"100%","align":"left","formatFunc":"","mobileColumn":false},{"show":false,"field":"payoutcount","title":"Payoutcount","width":"100%","align":"left","formatFunc":"","mobileColumn":false},{"show":true,"controller":"rightarrow","width":"20px","title":"-","field":"_rightArrow","mobileColumn":true}],"headerVisible":false,"height":"100%","isNavigationMenu":false,"manageHistory":false,"margin":"0","minDesktopHeight":60,"rightNavArrow":true,"styleAsGrid":false,"styles":{"fontSize":"14px"}}, {"onSelect":"app.serviceVariableGetNewequipmentByRwwutility","onSelect1":"app.serviceVariableGetConstructiontypeByRwwutility","onSelect2":"list1Select2"}, {
binding: ["wm.Binding", {}, {}, {
wire: ["wm.Wire", {"expression":undefined,"source":"serviceVariableGetRWWUtilityPayoutsByZipcodeAndEnergytype","targetProperty":"dataSet"}, {}]
}]
}]
}]
}],
layer2: ["wm.Layer", {"borderColor":"","caption":"layer2","horizontalAlign":"left","themeStyleType":"","verticalAlign":"top"}, {}, {
pageContainer1: ["wm.PageContainer", {"deferLoad":true,"pageName":"InputTechnology","subpageEventlist":{},"subpageMethodlist":{},"subpageProplist":{"layers1Name":"layers1.name","layers1Showing":"layers1.showing","layer1Name":"layer1.name","layer1Showing":"layer1.showing"}}, {}]
}]
}]
}]
};

ZipInput3.prototype._cssText = '';
ZipInput3.prototype._htmlText = '';