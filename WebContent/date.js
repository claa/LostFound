/**
 * 
 */
                
               function clock(){
            	  var time,year,month,day,hour,minute,second;
  				  var today=new Date();
  				  month=today.getMonth()+1;
  				  day=today.getDay();
 				  var s=today.getFullYear()+"年"+month+"月"+today.getDate()+"日"+today.getHours()+"时"+today.getMinutes()+"分"+today.getSeconds()+"秒";
				  document.getElementById("time").innerText=s;
				  
				  }
                 setInterval("clock()",1000);