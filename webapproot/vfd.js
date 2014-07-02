dojo.declare("vfd", wm.Application, {
	"disableDirtyEditorTracking": false, 
	"eventDelay": 0, 
	"i18n": false, 
	"isLoginPageEnabled": true, 
	"isSecurityEnabled": true, 
	"main": "Main", 
	"manageHistory": true, 
	"manageURL": false, 
	"name": "", 
	"phoneGapLoginPage": "Login", 
	"phoneMain": "", 
	"projectSubVersion": "Alpha20", 
	"projectVersion": 1, 
	"studioVersion": "6.5.2.Release", 
	"tabletMain": "", 
	"theme": "wm_green", 
	"toastPosition": "br", 
	"touchToClickDelay": 500, 
	"touchToRightClickDelay": 1500,
	"widgets": {
		imageListJay: ["wm.ImageList", {"url":"resources/images/jay"}, {}], 
		imageListPngIcons: ["wm.ImageList", {"url":"resources/images/pngicons"}, {}], 
		silkIconList: ["wm.ImageList", {"colCount":39,"height":16,"iconCount":90,"url":"lib/images/silkIcons/silk.png","width":16}, {}], 
		pageDialogComingSoon: ["wm.PageDialog", {"desktopHeight":"200px","footerBorderColor":"#2f5fac","height":"200px","mobileHeight":"200px","pageName":"_ComingSoon","styles":{"backgroundColor":"#ffffff"},"title":"Rebate Access","titlebarBorderColor":"#2f5fac"}, {}], 
		pageDialogNoRebates: ["wm.PageDialog", {"footerBorderColor":"","height":"50%","pageName":"NoRebates","styles":{"backgroundColor":""},"title":"Rebate Access","titlebarBorderColor":"","width":"80%"}, {}], 
		pageDialogSocialMedia: ["wm.PageDialog", {"corner":"bc","desktopHeight":"30px","footerBorderColor":"#ffffff","height":"30px","hideControls":true,"mobileHeight":"150px","modal":false,"noMaxify":true,"noMinify":true,"pageName":"SocialMedia","styles":{"backgroundColor":""},"title":"<div style='text-align:center;'>Share this mobile web app!</div>","titlebarBorderColor":"","width":"100%"}, {}], 
		serviceVariableGetConstructiontypeByRwwutility: ["wm.ServiceVariable", {"inFlightBehavior":"executeLast","operation":"getDistinctConstructiontypesByRwwutility","service":"RebatePrograms"}, {}, {
			input: ["wm.ServiceInput", {"type":"getDistinctConstructiontypesByRwwutilityInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"[zipInput3].list1.selectedItem.rwwutilityid","targetProperty":"rwwutilityid"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"[zipInput3].textZip.dataValue","targetProperty":"zipcode"}, {}]
				}]
			}]
		}], 
		serviceVariableGetNewequipmentByRwwutility: ["wm.ServiceVariable", {"inFlightBehavior":"executeLast","operation":"getDistinctNewequipmentByRwwutility","service":"RebatePrograms"}, {}, {
			input: ["wm.ServiceInput", {"type":"getDistinctNewequipmentByRwwutilityInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"[zipInput3].list1.selectedItem.rwwutilityid","targetProperty":"rwwutilityid"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"[zipInput3].textZip.dataValue","targetProperty":"zipcode"}, {}]
				}]
			}]
		}], 
		serviceVariableGetPayoutMinMaxFromRwwutility: ["wm.ServiceVariable", {"inFlightBehavior":"executeLast","operation":"getPayoutMinMaxFromRwwutility","service":"RebatePrograms"}, {}, {
			input: ["wm.ServiceInput", {"type":"getPayoutMinMaxFromRwwutilityInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"[zipInput].list1.selectedItem.rwwutilityid","targetProperty":"rwwutilityid"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"[zipInput].textZip.dataValue","targetProperty":"zipcode"}, {}]
				}]
			}]
		}], 
		serviceVariableGetRebateEstimate: ["wm.ServiceVariable", {"inFlightBehavior":"executeLast","operation":"getRebateEstimate","service":"RebatePrograms"}, {}, {
			input: ["wm.ServiceInput", {"type":"getRebateEstimateInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"[zipInput3].list1.selectedItem.rwwutilityid","targetProperty":"rwwutilityid"}, {}],
					wire1: ["wm.Wire", {"expression":undefined,"source":"[inputTechnology].selectMenu4.selectedItem.dataValue","targetProperty":"qty"}, {}],
					wire2: ["wm.Wire", {"expression":undefined,"source":"[inputTechnology].selectMenu1.selectedItem.dataValue","targetProperty":"hp"}, {}],
					wire3: ["wm.Wire", {"expression":undefined,"source":"[inputTechnology].selectMenu2.selectedItem.constructiontypeid","targetProperty":"constructiontypeid"}, {}],
					wire4: ["wm.Wire", {"expression":undefined,"source":"[inputTechnology].selectMenu3.selectedItem.newequipmentid","targetProperty":"newequipmentid"}, {}],
					wire5: ["wm.Wire", {"expression":undefined,"source":"[zipInput3].textZip.dataValue","targetProperty":"zipcode"}, {}]
				}]
			}]
		}], 
		serviceVariableGetRebateproramsByRwwutility: ["wm.ServiceVariable", {"inFlightBehavior":"executeLast","operation":"getRebateprogramByRwwutility","service":"RebatePrograms"}, {}, {
			input: ["wm.ServiceInput", {"type":"getRebateprogramByRwwutilityInputs"}, {}, {
				binding: ["wm.Binding", {}, {}, {
					wire: ["wm.Wire", {"expression":undefined,"source":"[zipInput3].list1.selectedItem.rwwutilityid","targetProperty":"rwwutilityid"}, {}]
				}]
			}]
		}]
	},
	_end: 0
});

vfd.extend({

    

	_end: 0
});