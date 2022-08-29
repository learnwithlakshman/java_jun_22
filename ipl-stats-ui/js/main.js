
let baseUrl = "http://localhost:8080/team/stats"

function getLabelDetails(){
    fetch(`${baseUrl}/labels`).then(json=>json.json()).then(data=>{
       let str =  `<select class="form-select" aria-label="team labels" id="teamLabel" onChange="showTeamDetails()">
                  <option selected value="">Select Team Label</option>`
            data.forEach(element => {
                    str += `<option value=${element}>${element}</option>`
            });
       str +=`</select>`
       document.querySelector("#team_labels_id").innerHTML = str;
    })
}

function showTeamDetails(){
   let teamLabel= document.querySelector("#teamLabel").value;
   if(teamLabel !=""){
    fetch(`${baseUrl}/${teamLabel}/players`).then(json=>json.json()).then(data=>{
       let str = `
       <table class="table">
  <thead>
    <tr>
      <th scope="col">Name</th>
      <th scope="col">Role</th>
      <th scope="col">Country</th>
      <th scope="col">Amount (INR)</th>
    </tr>
  </thead>
  <tbody>
       `
        data.forEach(ele=>{
            str += `<tr>
            <td>${ele.name}</td>
            <td>${ele.role}</td>
            <td>${ele.country}</td>
            <td>${ele.amount}</td>
            </tr>`
        })

       str +=`
       </tbody>
       </html>
       `
       document.querySelector("#player_details_id").innerHTML = str;
     });
   }
}

getLabelDetails();