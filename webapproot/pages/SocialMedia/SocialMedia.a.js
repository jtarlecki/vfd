dojo.declare("SocialMedia", wm.Page, {
start: function() {
},
"preferredDevice": "phone",
_end: 0
});

SocialMedia.widgets = {
layoutBox1: ["wm.Layout", {"horizontalAlign":"center","verticalAlign":"middle"}, {}, {
label1: ["wm.Label", {"align":"center","caption":"<div align='center'> <span class='st_twitter_large' displayText='Tweet'></span> <span class='st_facebook_large' displayText='Facebook'></span> <!--<span class='st_blogger_large' displayText='Blogger'></span>--> <span class='st_email_large' displayText='Email'></span> <span class='st_linkedin_large' displayText='LinkedIn'></span> <span class='st_sharethis_large' displayText='ShareThis'></span> <span class='st_googleplus_large' displayText='Google +'></span> </div>","height":"100%","padding":"4","singleLine":false,"styles":{"textAlign":"center"},"width":"100%"}, {}]
}]
};

SocialMedia.prototype._cssText = '';
SocialMedia.prototype._htmlText = '';