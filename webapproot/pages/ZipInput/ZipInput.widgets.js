ZipInput.widgets = {
	serviceVariableGetRwwutilitiesByZipcodeAndEnergytype: ["wm.ServiceVariable", {"inFlightBehavior":"executeLast","operation":"getRwwUtilitiesByZipcodeAndEnergytype","service":"RebatePrograms"}, {"onSuccess":"serviceVariableGetRwwutilitiesByZipcodeAndEnergytypeSuccess"}, {
		input: ["wm.ServiceInput", {"type":"getRwwUtilitiesByZipcodeAndEnergytypeInputs"}, {}, {
			binding: ["wm.Binding", {}, {}, {
				wire: ["wm.Wire", {"expression":undefined,"source":"textZip.dataValue","targetProperty":"zipcode"}, {}],
				wire1: ["wm.Wire", {"expression":"\"ELECTRIC\"","targetProperty":"energytype"}, {}]
			}]
		}]
	}],
	serviceVariableGetRWWUtilityPayoutsByZipcodeAndEnergytype: ["wm.ServiceVariable", {"inFlightBehavior":"executeLast","operation":"getRWWUtillityPayoutsByZipCodeAndEnergytype","service":"RebatePrograms"}, {"onSuccess":"serviceVariableGetRWWUtilityPayoutsByZipcodeAndEnergytypeSuccess"}, {
		input: ["wm.ServiceInput", {"type":"getRWWUtillityPayoutsByZipCodeAndEnergytypeInputs"}, {}, {
			binding: ["wm.Binding", {}, {}, {
				wire: ["wm.Wire", {"expression":undefined,"source":"textZip.dataValue","targetProperty":"zipcode"}, {}]
			}]
		}]
	}],
	layoutBox1: ["wm.Layout", {"horizontalAlign":"left","verticalAlign":"top"}, {}, {
		layers1: ["wm.Layers", {}, {}, {
			layer1: ["wm.Layer", {"borderColor":"","caption":"layer1","horizontalAlign":"left","themeStyleType":"","verticalAlign":"top"}, {"onShow":"layer1Show"}, {
				labelEnterZip: ["wm.Label", {"align":"center","caption":"Enter Zipcode","padding":"4","styles":{"fontWeight":"bold","fontSize":"16px"},"width":"100%"}, {}],
				textZip: ["wm.Text", {"caption":undefined,"changeOnKey":true,"dataValue":undefined,"desktopHeight":"35px","displayValue":"","height":"35px","invalidMessage":undefined,"promptMessage":undefined,"width":"100%"}, {"onchange":"textZipChange"}],
				button1: ["wm.Button", {"_classes":{"domNode":["rwwGreen"]},"caption":"Submit Zipcode","height":"40px","margin":"4","width":"100%"}, {"onclick":"serviceVariableGetRWWUtilityPayoutsByZipcodeAndEnergytype","onclick1":"app.serviceVariableGetPayoutMinMaxFromRwwutility"}],
				list1Panel: ["wm.Panel", {"height":"100%","horizontalAlign":"left","showing":false,"verticalAlign":"top","width":"100%"}, {}, {
					labelEnterZip1: ["wm.Label", {"align":"center","caption":"Select Electric Utility","padding":"4","styles":{"fontWeight":"bold","fontSize":"16px"},"width":"100%"}, {}],
					list1: ["wm.List", {"_classes":{"domNode":["MobileListStyle"]},"border":"0","columns":[{"show":false,"field":"PHONE COLUMN","title":"-","width":"100%","align":"left","expression":"","mobileColumn":false},{"show":true,"field":"rwwutilityname","title":"Rwwutilityname","width":"100%","align":"left","formatFunc":"","editorProps":null,"mobileColumn":true},{"show":true,"field":"checkprohibitimage","title":"Checkprohibitimage","width":"100%","align":"left","formatFunc":"wm_image_formatter","editorProps":{"restrictValues":true},"expression":"if (${payoutcount} > 0) \n{\n'resources/images/jay/check32.png';\n}\nelse\n{\n'resources/images/jay/block32.png';\n}","isCustomField":true,"mobileColumn":true},{"show":false,"field":"rwwutilityid","title":"Rwwutilityid","width":"100%","align":"left","formatFunc":"","mobileColumn":false},{"show":false,"field":"sumoverlap","title":"Sumoverlap","width":"100%","align":"left","formatFunc":"","mobileColumn":false},{"show":false,"field":"payoutcount","title":"Payoutcount","width":"100%","align":"left","formatFunc":"","mobileColumn":false},{"show":true,"controller":"rightarrow","width":"20px","title":"-","field":"_rightArrow","mobileColumn":true}],"headerVisible":false,"height":"100%","isNavigationMenu":false,"manageHistory":false,"margin":"0","minDesktopHeight":60,"rightNavArrow":true,"styleAsGrid":false,"styles":{"fontSize":"14px"}}, {"onSelect":"app.serviceVariableGetPayoutMinMaxFromRwwutility","onSelect1":"list1Select1"}, {
						binding: ["wm.Binding", {}, {}, {
							wire: ["wm.Wire", {"expression":undefined,"source":"serviceVariableGetRWWUtilityPayoutsByZipcodeAndEnergytype","targetProperty":"dataSet"}, {}]
						}]
					}]
				}]
			}],
			layer2: ["wm.Layer", {"borderColor":"","caption":"layer2","horizontalAlign":"left","themeStyleType":"","verticalAlign":"top"}, {}, {
				pageContainer1: ["wm.PageContainer", {"deferLoad":true,"pageName":"RebateProgramsMinMax","subpageEventlist":{},"subpageMethodlist":{},"subpageProplist":{}}, {}]
			}]
		}]
	}]
}