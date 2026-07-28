function checkFraud() {

    let amount = document.getElementById("amount").value;

    let result = document.getElementById("result");

    if (amount > 50000) {
        result.innerHTML = "⚠ Fraud Transaction";
        result.style.color = "red";
    }
    else {
        result.innerHTML = "✅ Safe Transaction";
        result.style.color = "green";
    }

}
