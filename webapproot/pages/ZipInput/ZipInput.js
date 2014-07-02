dojo.declare("ZipInput", wm.Page, {
	_pageTitle: "ZipInput",
    start: function() {
	    
    
	},
	"preferredDevice": "phone",
    
	textZipChange: function(inSender, inDisplayValue, inDataValue, inSetByCode) {
		//this.label1.setShowing(false);
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
            //app.toastPosition = "cc";
            
            app.toastError("No electric utilities found for '" + this.textZip.getDisplayValue() + "'",2000);
        }    
	},
	list1Select1: function(inSender, inItem) {
        var utility = this.list1.selectedItem.getData();
        if (utility.payoutcount > 0)
        {
            this.layer2.activate();
        }
        else
        {
            app.pageDialogNoRebates.show();
            this.list1.deselectAll();
        }
	},
	_end: 0
});