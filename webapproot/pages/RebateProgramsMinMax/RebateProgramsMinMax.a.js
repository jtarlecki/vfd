dojo.declare("RebateProgramsMinMax", wm.Page, {
start: function() {
},
"preferredDevice": "phone",
_end: 0
});

RebateProgramsMinMax.widgets = {
layoutBox1: ["wm.Layout", {"horizontalAlign":"left","verticalAlign":"top"}, {}, {
list1: ["wm.List", {"_classes":{"domNode":["MobileListStyle"]},"border":"0","columns":[{"show":false,"field":"PHONE COLUMN","title":"-","width":"100%","align":"left","editorProps":{"restrictValues":true},"expression":"","mobileColumn":false},{"show":true,"field":"minmaxdisplay","title":"Minmaxdisplay","width":"100%","align":"left","editorProps":{"restrictValues":true},"expression":"\"<div class='MobileRowTitle' style='color:black'>\" + ${c0.rebateProgramName} + \"</div>\" +\n\"</br>\" + \n\"<div>Min Payout: \" + ${c0.minPayoutDollarsText} + \" \" + ${c0.minPayoutUnits} + \"</div>\" +\n\"<div>Max Payout: \" + ${c0.maxPayoutDollarsText} + \" \" + ${c0.maxPayoutUnits} + \"</div>\"","isCustomField":true,"mobileColumn":true},{"show":false,"field":"c0.rebateProgramTechnologyId","title":"C0.rebateProgramTechnologyId","width":"100%","displayType":"Java.lang.Integer","align":"left","formatFunc":""},{"show":false,"field":"c0.minPayoutUnits","title":"C0.minPayoutUnits","width":"100%","displayType":"Java.lang.String","align":"left","formatFunc":""},{"show":false,"field":"c0.maxPayoutDollars","title":"C0.maxPayoutDollars","width":"100%","displayType":"Java.math.BigDecimal","align":"left","formatFunc":""},{"show":false,"field":"c0.minPayoutId","title":"C0.minPayoutId","width":"100%","displayType":"Java.lang.Integer","align":"left","formatFunc":""},{"show":false,"field":"c0.technologyId","title":"C0.technologyId","width":"100%","displayType":"Java.lang.Integer","align":"left","formatFunc":""},{"show":false,"field":"c0.stateAbbr","title":"C0.stateAbbr","width":"100%","displayType":"Java.lang.String","align":"left","formatFunc":""},{"show":false,"field":"c0.maxPayoutId","title":"C0.maxPayoutId","width":"100%","displayType":"Java.lang.Integer","align":"left","formatFunc":""},{"show":false,"field":"c0.maxPayoutUnits","title":"C0.maxPayoutUnits","width":"100%","displayType":"Java.lang.String","align":"left","formatFunc":""},{"show":false,"field":"c0.rebateProgramId","title":"C0.rebateProgramId","width":"100%","displayType":"Java.lang.Integer","align":"left","formatFunc":""},{"show":false,"field":"c0.minPayoutDollars","title":"C0.minPayoutDollars","width":"100%","displayType":"Java.math.BigDecimal","align":"left","formatFunc":""},{"show":false,"field":"c0.rebateProgramName","title":"C0.rebateProgramName","width":"100%","displayType":"Java.lang.String","align":"left","formatFunc":""},{"show":false,"field":"c0.maxPayoutDollarsText","title":"C0.maxPayoutDollarsText","width":"100%","displayType":"Java.lang.String","align":"left","formatFunc":""},{"show":false,"field":"c0.minPayoutDollarsText","title":"C0.minPayoutDollarsText","width":"100%","displayType":"Java.lang.String","align":"left","formatFunc":""}],"headerVisible":false,"height":"100%","margin":"0","minDesktopHeight":60,"selectionMode":"none","styleAsGrid":false,"styles":{"fontSize":"14px"}}, {}, {
binding: ["wm.Binding", {}, {}, {
wire: ["wm.Wire", {"expression":undefined,"source":"app.serviceVariableGetPayoutMinMaxFromRwwutility","targetProperty":"dataSet"}, {}]
}]
}]
}]
};

RebateProgramsMinMax.prototype._cssText = '';
RebateProgramsMinMax.prototype._htmlText = '';