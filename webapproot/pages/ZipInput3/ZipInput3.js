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