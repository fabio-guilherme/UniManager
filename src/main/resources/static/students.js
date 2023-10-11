async function getStudents() {
    try {
        let res = await $.ajax({
            url: "/api/students",
            method: "get",
            dataType: "json"
        });
        document.getElementById("result").innerHTML = JSON.stringify(res);
    } catch (error) { console.log(error); }
}