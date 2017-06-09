function add(){
    var data1={"id":3,"name":"fdfkk","pwd":"32","newUrl":"","imageUrl":""};  
    $.ajax({ 
        type:"POST", 
        url:"diction/add", 
        dataType:"json",      
        contentType:"application/json",               
        data:JSON.stringify(data1), 
        success:function(data){ 
                  alert(data.name+data.id);                 
        } 
     }); 
}