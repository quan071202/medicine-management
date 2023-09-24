var d = new Date();


var date = (day + '/' + month + '/' + year);
var data = []; // Khai báo mảng trong javascript

// Check trùng id
function checkID(id) {
    var list = this.data;
    for (var i = 0; i < list.length; i++) {
        if (list[i].id == id) {
            return true;
        }
    }
}

// Check chưa nhập thông tin
function checkInfo() {
    var id = document.getElementById('id').value;
    var password = document.getElementById('password').value;
    var email = document.getElementById('email').value;
    var date = document.getElementById('date').value;

    if (id && password && email) {
        return true;
    } else {
        alert('Vui lòng nhập đầy đủ thông tin trước khi thêm!');
    }
}

// Thêm mới nhân viên
function Add() {
    var id = document.getElementById('id').value;
    var password = document.getElementById('password').value;
    var email = document.getElementById('email').value;
    var date = document.getElementById('date').value;

    var item = {
        id: id,
        password: password,
        email: email,
        date: date
    };

    if (checkID(id)) {
        alert("ID đã tồn tại, vui lòng nhập ID khác!");
    } else if (checkInfo()) {
        this.data.push(item);
        console.log(data);
        View();
    }
}

// Hiển thị nhân viên
function View() {
    var list = this.data;

    // Xử lý cộng chuỗi thành html - table
    var datas = '<table border="1" cellpadding="5"><tr><td>Id</td><td>Password</td><td>Ngày thêm</td><td>Email</td><td>Action</td></tr>';
    for (var i = 0; i < list.length; i++) {

        datas += "<tr>";
        datas += "<td>" + list[i].id + "</td>";
        datas += "<td>" + list[i].password + "</td>";
        datas += "<td>" + date + "</td>";
        datas += "<td>" + list[i].email + "</td>";
        datas += "<td><button onclick='Deletes(" + list[i].id + ")'>Xóa</button>";
        datas += "</tr>";
    }
    datas += '</table>';

    if (list.length != 0) {
        document.getElementById('database').innerHTML = datas;
    } else {
        document.getElementById('database').innerHTML = 'Dữ liệu trống!';
    }

}

// Xóa nhân viên theo id
function Deletes(id) {
    var list = this.data;
    var check = confirm("Bạn có muốn xóa nhân viên này không?");

    if (check) {
        for (var i = 0; i < list.length; i++) {
            if (list[i].id == id) {
                list.splice(i, 1);
            }
        }
    }
    View(); // gọi hàm hiển thị
}

// Refresh
function Refresh() {
    document.getElementById('id').value = '';
    document.getElementById('password').value = '';
    document.getElementById('email').value = '';
    document.getElementById('phone').value = '';
}