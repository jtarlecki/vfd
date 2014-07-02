dojo.declare("Main", wm.Page, {
	_pageTitle: "Main",
    start: function() {
        this.buttonBack.setShowing(false);
        this.spacer1.setShowing(false);
        
	},
	"preferredDevice": "phone",


	list1Select: function(inSender, inItem) {
	    var i = inSender.getSelectedIndex() + 1;
        if (i==1)
        {
             this.navLayer2.update();
        }
        else if (i==2)
        {
            this.navLayer3.update();                
        }
        else if (i==3)
        {
            this.navLayer4.update();      
        }
        else if (i==4)
        {
            this.navLayer5.update();
        }        
        else
        {
            alert("wtf");
        }
        
        this.buttonBack.setShowing(true);
        this.spacer1.setShowing(true);
        
    },


	listStatesSelect: function(inSender, inItem) {
		this.navLayerSLA1_1.update();
	},
	
	layer1Show: function(inSender) {
        //alert('layer 1 is now showing');
        this.buttonBack.setShowing(false);
        this.spacer1.setShowing(false);
        this.list1.deselectAll();
        
	},
	
    iconMailtoClick: function(inSender) {
        //var daReferrer = document.referrer;
        //var errorMsg = "here here here is the error error error error";
        //var body_message = "%0D%0D%0D%0DThank you "+name+" for submitting this error to us. Please tell us in the space above, what you were doing when the error occurred.%0D%0DReferring Page: "+daReferrer+" %0D%0DException Error Message:%0D-------------------------------------------%0D"+errorMsg;
        
        var email = "jtarlecki@realwinwin.com";
        var subject = "[Rebate Access] VFD Mobile App";
        var body_message = 'Dear Rebate Access,%0D%0DThis mobile app is fantasitc! However, I have a few more questions that were left unanswered:%0D%0D';
        var mailto_link = 'mailto:'+email+'?subject='+subject+'&body='+body_message;

        win = window.open(mailto_link,'emailWindow');
        if (win && win.open &&!win.closed) win.close();
        
        //app.toastInfo("<img src='resources/images/PNGicons/10-medical.png'>", 12000);
        
	},


	iconHomeClick: function(inSender) {
		this.pageContainer3.forceReloadPage();
        this.pageContainer4.forceReloadPage();
        this.layer1.activate();
	},

    buttonBackClick1: function(inSender) {
        if (this.layer4.isActive())
        {
            //input equip info page
            var l1 = this.pageContainer4.widgets.layoutBox1.widgets.layers1.widgets.client.widgets.layer1;
            var l2 = this.pageContainer4.widgets.layoutBox1.widgets.layers1.widgets.client.widgets.layer2;
            
            if (l2.isActive())
            {
                
                var m = l2.widgets.pageContainer1.widgets.layoutBox1.widgets.layers1.widgets.client.widgets.layer1.isActive();

                if (m)
                {
                    //alert('we are in InputTechnology');
                    l1.activate();
                }
                else
                {
                    //alert('we are in RebateFeedback');
                    this.app._onBack();
                }
            }
            else
            {
                //alert('we are in ZipInput3');
                this.layer1.activate();
            }
            

            
        }
        else
        {
            this.app._onBack();
        }

    },
    
    
	iconSettingsClick1: function(inSender) {
		//app.toastPosition = "cc";
        app.toastInfo("<b>About RealWinwin:</b></br></br> We are a team of young, motivated professionals who believe sustainable energy is our future.  There is a long road to travel, but by tapping into our most accessible resource, we can get there.  You.  Solar, wind, and biofuels are a long way off, but you are right here, right now.  When we write you a check for selling or buying more efficient equipment, we are helping your bottom line and taking a step towards sustainability.  It’s not always easy, but we love what we do because it’s the right thing to do.  Together we can save money and reduce carbon emissions.");
	},


	_end: 0
});