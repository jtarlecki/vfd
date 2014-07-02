InputTechnology.widgets = {
	constructiontypesLiveVariable1: ["wm.LiveVariable", {"type":"com.rebateprograms.data.ConstructionTypes"}, {}, {
		liveView: ["wm.LiveView", {"dataType":"com.rebateprograms.data.ConstructionTypes","view":[{"caption":"Id","sortable":true,"dataIndex":"id","type":"java.lang.Integer","displayType":"Number","required":true,"readonly":true,"includeLists":true,"includeForms":true,"order":0,"subType":null},{"caption":"Code","sortable":true,"dataIndex":"code","type":"java.lang.String","displayType":"Text","required":true,"readonly":false,"includeLists":true,"includeForms":true,"order":1,"subType":null},{"caption":"Name","sortable":true,"dataIndex":"name","type":"java.lang.String","displayType":"Text","required":true,"readonly":false,"includeLists":true,"includeForms":true,"order":2,"subType":null},{"caption":"Description","sortable":true,"dataIndex":"description","type":"java.lang.String","displayType":"Text","required":false,"readonly":false,"includeLists":true,"includeForms":true,"order":3,"subType":null},{"caption":"CreatedUser","sortable":true,"dataIndex":"createdUser","type":"java.lang.String","displayType":"Text","required":true,"readonly":false,"includeLists":true,"includeForms":true,"order":4,"subType":null},{"caption":"CreatedDate","sortable":true,"dataIndex":"createdDate","type":"java.util.Date","displayType":"Date","required":true,"readonly":false,"includeLists":true,"includeForms":true,"order":5,"subType":null},{"caption":"ModifiedUser","sortable":true,"dataIndex":"modifiedUser","type":"java.lang.String","displayType":"Text","required":true,"readonly":false,"includeLists":true,"includeForms":true,"order":6,"subType":null},{"caption":"ModifiedDate","sortable":true,"dataIndex":"modifiedDate","type":"java.util.Date","displayType":"Date","required":true,"readonly":false,"includeLists":true,"includeForms":true,"order":7,"subType":null}]}, {}]
	}],
	newequipmentLiveVariable1: ["wm.LiveVariable", {"type":"com.rebateprograms.data.NewEquipment"}, {}, {
		liveView: ["wm.LiveView", {"dataType":"com.rebateprograms.data.NewEquipment","view":[{"caption":"Id","sortable":true,"dataIndex":"id","type":"java.lang.Integer","displayType":"Number","required":true,"readonly":true,"includeLists":true,"includeForms":true,"order":0,"subType":null},{"caption":"Name","sortable":true,"dataIndex":"name","type":"java.lang.String","displayType":"Text","required":true,"readonly":false,"includeLists":true,"includeForms":true,"order":1,"subType":null},{"caption":"Description","sortable":true,"dataIndex":"description","type":"java.lang.String","displayType":"Text","required":false,"readonly":false,"includeLists":true,"includeForms":true,"order":2,"subType":null},{"caption":"CreatedUser","sortable":true,"dataIndex":"createdUser","type":"java.lang.String","displayType":"Text","required":true,"readonly":false,"includeLists":true,"includeForms":true,"order":3,"subType":null},{"caption":"CreatedDate","sortable":true,"dataIndex":"createdDate","type":"java.util.Date","displayType":"Date","required":true,"readonly":false,"includeLists":true,"includeForms":true,"order":4,"subType":null},{"caption":"ModifiedUser","sortable":true,"dataIndex":"modifiedUser","type":"java.lang.String","displayType":"Text","required":true,"readonly":false,"includeLists":true,"includeForms":true,"order":5,"subType":null},{"caption":"ModifiedDate","sortable":true,"dataIndex":"modifiedDate","type":"java.util.Date","displayType":"Date","required":true,"readonly":false,"includeLists":true,"includeForms":true,"order":6,"subType":null}]}, {}]
	}],
	variableHP: ["wm.Variable", {"isList":true,"json":"[{\"name\":\"5\",\"dataValue\":\"5\"},{\"name\":\"7.5\",\"dataValue\":\"7.5\"},{\"name\":\"10\",\"dataValue\":\"10\"},{\"name\":\"15\",\"dataValue\":\"15\"},{\"name\":\"20\",\"dataValue\":\"20\"},{\"name\":\"25\",\"dataValue\":\"25\"},{\"name\":\"30\",\"dataValue\":\"30\"},{\"name\":\"40\",\"dataValue\":\"40\"},{\"name\":\"50\",\"dataValue\":\"50\"},{\"name\":\"60\",\"dataValue\":\"60\"},{\"name\":\"75\",\"dataValue\":\"75\"},{\"name\":\"100\",\"dataValue\":\"100\"},{\"name\":\"200\",\"dataValue\":\"200\"}]","type":"EntryData"}, {}],
	variableQty: ["wm.Variable", {"isList":true,"json":"[{\"name\":\"1\",\"dataValue\":\"1\"},{\"name\":\"2\",\"dataValue\":\"2\"},{\"name\":\"3\",\"dataValue\":\"3\"},{\"name\":\"4\",\"dataValue\":\"4\"},{\"name\":\"5\",\"dataValue\":\"5\"},{\"name\":\"6\",\"dataValue\":\"6\"},{\"name\":\"7\",\"dataValue\":\"7\"},{\"name\":\"8\",\"dataValue\":\"8\"},{\"name\":\"9\",\"dataValue\":\"9\"},{\"name\":\"10\",\"dataValue\":\"10\"}]","type":"EntryData"}, {}],
	layers1Name: ["wm.Property", {"bindSource":undefined,"bindTarget":undefined,"property":"layers1.name","readonly":true,"type":"string"}, {}],
	layers1Showing: ["wm.Property", {"bindSource":undefined,"property":"layers1.showing","type":"Boolean"}, {}],
	layer1Name: ["wm.Property", {"bindSource":undefined,"bindTarget":undefined,"property":"layer1.name","readonly":true,"type":"string"}, {}],
	layer1Showing: ["wm.Property", {"bindSource":undefined,"property":"layer1.showing","type":"Boolean"}, {}],
	layoutBox1: ["wm.Layout", {"horizontalAlign":"left","verticalAlign":"top"}, {}, {
		layers1: ["wm.Layers", {}, {"onShow":"layers1Show"}, {
			layer1: ["wm.Layer", {"borderColor":"","caption":"layer1","horizontalAlign":"left","themeStyleType":"","verticalAlign":"top"}, {}, {
				label1: ["wm.Label", {"align":"center","caption":"Input Equipment Info","padding":"4","styles":{"fontWeight":"bold"},"width":"100%"}, {}],
				panel1: ["wm.Panel", {"autoScroll":true,"enableTouchHeight":true,"height":"100%","horizontalAlign":"left","verticalAlign":"top","width":"100%"}, {}, {
					selectMenu4: ["wm.SelectMenu", {"caption":"Quantity","dataField":"dataValue","dataType":"EntryData","dataValue":"","desktopHeight":"50px","displayField":"dataValue","displayValue":"","emptyValue":"emptyString","height":"35px","width":"100%"}, {}, {
						binding: ["wm.Binding", {}, {}, {
							wire: ["wm.Wire", {"expression":undefined,"source":"variableQty","targetProperty":"dataSet"}, {}]
						}]
					}],
					selectMenu1: ["wm.SelectMenu", {"caption":"hp","dataType":"EntryData","dataValue":"","desktopHeight":"50px","displayField":"name","displayValue":"","emptyValue":"emptyString","height":"35px","width":"100%"}, {}, {
						binding: ["wm.Binding", {}, {}, {
							wire: ["wm.Wire", {"expression":undefined,"source":"variableHP","targetProperty":"dataSet"}, {}]
						}]
					}],
					selectMenu2: ["wm.SelectMenu", {"caption":"Project","dataType":"com.rebateprograms.data.output.GetDistinctConstructiontypesByRwwutilityRtnType","dataValue":"","desktopHeight":"35px","displayField":"constructiontypename","displayValue":"","emptyValue":"emptyString","height":"35px","width":"100%"}, {}, {
						binding: ["wm.Binding", {}, {}, {
							wire: ["wm.Wire", {"expression":undefined,"source":"app.serviceVariableGetConstructiontypeByRwwutility","targetProperty":"dataSet"}, {}]
						}]
					}],
					selectMenu3: ["wm.SelectMenu", {"caption":"Application","dataType":"com.rebateprograms.data.output.GetDistinctNewequipmentByRwwutilityRtnType","dataValue":"","desktopHeight":"300px","displayField":"newequipmentname","displayValue":"","emptyValue":"emptyString","height":"35px","width":"100%"}, {}, {
						binding: ["wm.Binding", {}, {}, {
							wire: ["wm.Wire", {"expression":undefined,"source":"app.serviceVariableGetNewequipmentByRwwutility","targetProperty":"dataSet"}, {}]
						}]
					}],
					spacer1: ["wm.Spacer", {"height":"48px","width":"96px"}, {}],
					button1: ["wm.Button", {"_classes":{"domNode":["rwwGreen"]},"borderColor":"#2f5fac","caption":"Calculate Rebate >>","desktopHeight":"50px","height":"50px","margin":"4","mobileHeight":"50px","styles":{"backgroundColor":""},"width":"100%"}, {"onclick":"button1Click","onclick1":"layer2","onclick2":"app.serviceVariableGetRebateEstimate"}, {
						binding: ["wm.Binding", {}, {}, {
							wire: ["wm.Wire", {"expression":"${selectMenu4.displayValue}!=\"\" && ${selectMenu1.displayValue} !=\"\" && ${selectMenu2.displayValue} !=\"\" && ${selectMenu3.displayValue} !=\"\";","targetProperty":"showing"}, {}]
						}]
					}]
				}]
			}],
			layer2: ["wm.Layer", {"borderColor":"","caption":"layer2","horizontalAlign":"left","themeStyleType":"","verticalAlign":"top"}, {}, {
				pageContainer1: ["wm.PageContainer", {"deferLoad":true,"pageName":"RebateFeedback","subpageEventlist":{},"subpageMethodlist":{},"subpageProplist":{}}, {}]
			}]
		}]
	}]
}