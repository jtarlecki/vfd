_ComingSoon.widgets = {
	layoutBox1: ["wm.Layout", {"horizontalAlign":"center","verticalAlign":"middle"}, {}, {
		label1: ["wm.Label", {"align":"center","height":"27px","padding":"4","singleLine":false,"width":"100%"}, {}, {
			binding: ["wm.Binding", {}, {}, {
				wire: ["wm.Wire", {"expression":"'<i>Coming soon!</i>'","targetProperty":"caption"}, {}]
			}]
		}],
		picture1: ["wm.Picture", {"height":"40px","source":"resources/images/jay/91-beaker-2.png","width":"40px"}, {"onclick":"picture1Click"}]
	}]
}