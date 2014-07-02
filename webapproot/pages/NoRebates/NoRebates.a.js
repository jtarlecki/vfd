dojo.declare("NoRebates", wm.Page, {
start: function() {
},
"preferredDevice": "phone",
_end: 0
});

NoRebates.widgets = {
layoutBox1: ["wm.Layout", {"horizontalAlign":"center","verticalAlign":"middle"}, {}, {
picture1: ["wm.Picture", {"height":"30px","source":"resources/images/jay/132-ghost.png","width":"30px"}, {}],
label1: ["wm.Label", {"align":"center","caption":"No Rebates Available for Selected Utility","height":"44px","padding":"4","singleLine":false,"width":"100%"}, {}]
}]
};

NoRebates.prototype._cssText = '';
NoRebates.prototype._htmlText = '';