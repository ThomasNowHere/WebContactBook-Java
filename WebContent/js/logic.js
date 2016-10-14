 
   var countryAustralia=["Canberra", "Sydney", "Melbourne"];
   var countryCroatia=["Osijek", "Split", "Zagreb"];
   var countryCanada=["Quebec", "Ontario", "Alberta"];
   var countryEngland=["Essex", "Hampshire", "Surrey"];
   var countryUSA=["California", "Illinois", "Wisconsin"];
   
   var box=document.getElementById('gender');
   var box1=document.getElementById('coun');
   var box2=document.getElementById('cit');
   var box3=document.getElementById('alp2');
   var box4=document.getElementById('zip');
   var box5=document.getElementById('alp3');
   var box6=document.getElementById('gen');
   var box7=document.getElementById('cities');
   
   function countryChanged(country)
   {  
      var selectCountry = document.getElementById('cities');
      var ln = selectCountry.length - 1;
      while (ln > 0)
      { 
        selectCountry.remove(1);  //Remove all but "Select State"
        ln--;
      }
      
      var countryArray;
      
      switch(country)
      {
        case "1":
            countryArray=countryAustralia
            break;
        case "2":
          countryArray=countryCanada
            break;
        case "3":
          countryArray=countryCroatia
            break;
        case "4":
          countryArray=countryEngland
            break;
        case "5":
          countryArray=countryUSA
            break;    
        default:
      }      
          
      for (i = 0; i < countryArray.length; i++)
      {
        var option = document.createElement('option'); 
        option.text = countryArray[i];
        option.value = countryArray[i];
        selectCountry.add(option);
      } 
   }
   
   function genderValue(x)
   {       
     box.value=x;
   }
   function countryValue(x)
   {       
           box1.value=x;
           if(x=="1"){ box3.value="AU"; box5.value="AUS"; }
           else if(x=="2"){ box3.value="CA"; box5.value="CAN"; }
           else if(x=="3"){ box3.value="CR"; box5.value="CRO"; }
           else if(x=="4"){ box3.value="EN"; box5.value="ENG";}
           else if(x=="5"){ box3.value="US"; box5.value="USA"; }
   }
   function cityValue(x)
   {   
     if(x=="Canberra"){ box4.value="3000"; box2.value="1"; }
     else if(x=="Sydney"){ box4.value="3201"; box2.value="2"; }
     else if(x=="Melbourne"){ box4.value="3542"; box2.value="3"; }
     else if(x=="Osijek"){ box4.value="31000"; box2.value="4"; }
     else if(x=="Split"){ box4.value="21000"; box2.value="6"; }
     else if(x=="Zagreb"){ box4.value="10000"; box2.value="5"; }
     else if(x=="Quebec"){ box4.value="23553"; box2.value="7"; }
     else if(x=="Ontario"){ box4.value="325453"; box2.value="8"; }
     else if(x=="Alberta"){ box4.value="32152"; box2.value="9"; }
     else if(x=="Essex"){ box4.value="235211"; box2.value="10"; }
     else if(x=="Hampshire"){ box4.value="365467"; box2.value="11"; }
     else if(x=="Surrey"){ box4.value="56544"; box2.value="12"; }
     else if(x=="California"){ box4.value="234553"; box2.value="13"; }
     else if(x=="Illinois"){ box4.value="97997"; box2.value="14"; }
     else if(x=="Wisconsin"){ box4.value="343433"; box2.value="15"; }
           
   }

  