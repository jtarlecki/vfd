Login.widgets = {
	phonegapCredentialStorage: ["wm.Variable", {"saveInPhonegap":true,"type":"EntryData"}, {}],
	loginVariable1: ["wm.LoginVariable", {}, {"onError":"loginFailed","onResult":"loadingDialog.hide","onSuccess":"onLoginSuccess"}, {
		input: ["wm.ServiceInput", {"type":"loginInputs"}, {}, {
			binding: ["wm.Binding", {}, {}, {
				wire: ["wm.Wire", {"expression":undefined,"source":"usernameInput.dataValue","targetProperty":"username"}, {}],
				wire1: ["wm.Wire", {"expression":undefined,"source":"passwordInput.dataValue","targetProperty":"password"}, {}]
			}]
		}]
	}],
	loadingDialog: ["wm.LoadingDialog", {"_classes":{"domNode":["rounded"]},"caption":"Logging in","captionSize":"80px","captionWidth":"100px"}, {}, {
		binding: ["wm.Binding", {}, {}, {
			wire: ["wm.Wire", {"expression":undefined,"source":"loginInputPanel","targetProperty":"widgetToCover"}, {}]
		}]
	}],
	layoutBox: ["wm.Layout", {}, {}, {
		headerPanel: ["wm.Panel", {"height":"40px","horizontalAlign":"left","layoutKind":"left-to-right","verticalAlign":"top","width":"100%"}, {}, {
			wmTitle: ["wm.Label", {"align":"center","caption":"Rebate Access","height":"100%","padding":"4","styles":{"backgroundColor":"#000000","color":"#ffffff","fontWeight":"bold","fontSize":"16px"},"width":"100%"}, {}]
		}],
		loginMainPanel: ["wm.Panel", {"height":"100%","horizontalAlign":"center","padding":"10","styles":{"backgroundColor":"#2f5fac"},"verticalAlign":"center","width":"100%"}, {}, {
			loginInputPanel: ["wm.HeaderContentPanel", {"_classes":{"domNode":["rounded"]},"border":"2","desktopHeight":"222px","deviceType":null,"enableTouchHeight":true,"fitToContentHeight":true,"height":"186px","horizontalAlign":"center","margin":"10","mobileHeight":"290px","padding":"10","styles":{"color":"","backgroundColor":"#b7acac"},"verticalAlign":"top","width":"390px"}, {"onEnterKeyPress":"loginButton.click"}, {
				panel1: ["wm.Panel", {"fitToContentHeight":true,"height":"92px","horizontalAlign":"left","verticalAlign":"top","width":"100%"}, {}, {
					usernameInput: ["wm.Text", {"caption":"Username","captionSize":"120px","dataValue":undefined,"desktopHeight":"35px","displayValue":"","height":"45px","mobileHeight":"45px","width":"100%"}, {}],
					passwordInput: ["wm.Text", {"caption":"Password","captionSize":"120px","dataValue":undefined,"desktopHeight":"35px","displayValue":"","height":"45px","mobileHeight":"45px","password":true,"width":"100%"}, {}]
				}],
				loginButtonPanel: ["wm.Panel", {"height":"50px","horizontalAlign":"right","layoutKind":"left-to-right","padding":"4","width":"100%"}, {}, {
					loginErrorMsg: ["wm.Label", {"align":"center","caption":" ","height":"100%","padding":"4","singleLine":false,"width":"100%"}, {}, {
						format: ["wm.DataFormatter", {}, {}]
					}],
					loginButton: ["wm.Button", {"borderColor":"#000000","caption":"Login","height":"100%","margin":"4","styles":{"backgroundColor":"#020202"},"width":"90px"}, {"onclick":"loginButtonClick","onclick2":"loadingDialog.show","onclick3":"loginVariable1"}]
				}]
			}]
		}]
	}]
}