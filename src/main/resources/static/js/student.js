/**
 * 通过名字查询学生信息
 */
$('#button1').click(function () {
    $.ajax({
        type: "GET",
        url: "/student/page",
        data: {
            'name': $('#text').val()
        },
        dataType: "json",
        success: function (resp) {
            console.info(resp)
            if (resp.code == 0) {
                $('#td1').html(resp.data[0].columns.name)
                $('#td2').html(resp.data[0].columns.age)
                $('#td3').html(resp.data[0].columns.id)
                $('#td4').html(resp.data[0].columns.TheClass)
                $('#td5').html(resp.data[0].columns.birthday)
                $('#td6').html(resp.data[0].columns.address)
                $('#td7').html(resp.data[0].columns.comprehensive)
                $('#td8').html(resp.data[0].columns.comments)
            } else {
                //$("#searchResult").html("出现错误：" + data.msg);
            }
        },
        error: function (jqXHR) {
            aler("发生错误：" + jqXHR.status);
        }
    });
})

/**
 * 通过id删除学生信息
 */
function del() {
    $.ajax({
        type: "POST",
        url: "/student/delete",
        data: {
            'id': $('#td3').html()
        },
        dataType: "json",
        success: function (resp) {
            console.info(resp)
            if (resp.code == 0) {
            } else {
                //$("#searchResult").html("出现错误：" + data.msg);
            }
        },
        error: function (jqXHR) {
            aler("发生错误：" + jqXHR.status);
        }
    })
}

/**
 查询成绩，并将它显示出来
 */
function results() {
    $('#result_div').css('display', 'block')
    $.ajax({
        url: "/results/query",
        data: {
            'id': $('#td3').html()
        },
        dataType: "json",
        success: function (resp) {
            console.info(resp)
            if (resp.code == 0) {
                $('#results_id_1').html(resp.data[0].columns.subjects)
                    .next('td').html(resp.data[0].columns.results)
                    .next('td').children().attr('title', resp.data[0].columns.id)
                $('#results_id_2').html(resp.data[1].columns.subjects)
                    .next('td').html(resp.data[1].columns.results)
                    .next('td').children().attr('title', resp.data[1].columns.id)
                $('#results_id_3').html(resp.data[2].columns.subjects)
                    .next('td').html(resp.data[2].columns.results)
                    .next('td').children().attr('title', resp.data[2].columns.id)
                $('#results_id_4').html(resp.data[3].columns.subjects)
                    .next('td').html(resp.data[3].columns.results)
                    .next('td').children().attr('title', resp.data[3].columns.id)
                $('#results_id_5').html(resp.data[4].columns.subjects)
                    .next('td').html(resp.data[4].columns.results)
                    .next('td').children().attr('title', resp.data[4].columns.id)
                $('#results_id_6').html(resp.data[5].columns.subjects)
                    .next('td').html(resp.data[5].columns.results)
                    .next('td').children().attr('title', resp.data[5].columns.id)
            } else {
                //$("#searchResult").html("出现错误：" + data.msg);
            }
        },
        error: function (jqXHR) {
            aler("发生错误：" + jqXHR.status);
        }
    })
}

/**
 学生添加
 */
function openStudent() {
    $("#add_student").dialog("open");
}

function studentAdd() {
    var name = $('#student_1').val()
    var age = $('#student_2').val()
    var TheClass = $('#student_3').val()
    var birthday = $('#student_4').val()
    var address = $('#student_5').val()
    var comprehensive = $('#student_6').val()

    $.ajax({

        type: "POST",
        url: "/student/save",
        data: {
            'name': name,
            'age': age,
            'TheClass': TheClass,
            'birthday': birthday,
            'address': address,
            'comprehensive': comprehensive
        },
        dataType: "json",
        success: function (resp) {
            console.info(resp)
            if (resp.code == 0) {
            } else {
                //$("#searchResult").html("出现错误：" + data.msg);
            }
        },
        error: function (jqXHR) {
            aler("发生错误：" + jqXHR.status);
        }
    })
    alert("ok")
    $("#add_student").dialog("close")
}

/**
 * 修改学生信息
 */
function openUpdatestudent() {

    $("#update_student").dialog("open")
}

function submitUpdateStudent() {
    var id = $('#td3').html()
    var name = $('#student_update_1').val()
    var age = $('#student_update_2').val()
    var TheClass = $('#student_update_3').val()
    var birthday = $('#student_update_4').val()
    var address = $('#student_update_5').val()
    var comprehensive = $('#student_update_6').val()
    $.ajax({
        type: "POST",
        url: "/student/update",
        data: {
            'id': id,
            'name': name,
            'age': age,
            'TheClass': TheClass,
            'birthday': birthday,
            'address': address,
            'comprehensive': comprehensive
        },
        dataType: "json",
        success: function (resp) {
            console.info(resp)
            if (resp.code == 0) {
            } else {
                //$("#searchResult").html("出现错误：" + data.msg);
            }
        },
        error: function (jqXHR) {
            aler("发生错误：" + jqXHR.status);
        }
    })
    alert('ok')
    $("#update_student").dialog("close")
}


/**
 * 科目-删除/修改
 * @type {jQuery}
 */
var $buttons = $('#result_div').find('button')
var resultsId = 0;//修改成绩时使用的id
$buttons.click(function () {
    var index = $(this).index();
    var id = $(this).attr('title')
    resultsId = id;
    if ($(this).html() == '删除') {
        $.ajax({
            type: "POST",
            url: "/results/delete",
            data: {
                'id': id
            },
            dataType: "json",
            success: function (resp) {
                console.info(resp)
                if (resp.code == 0) {
                } else {
                    //$("#searchResult").html("出现错误：" + data.msg);
                }
            },
            error: function (jqXHR) {
                aler("发生错误：" + jqXHR.status);
            }
        })
        alert('删除成功')
        location.replace
    } else if ($(this).html() == '修改') {
        $("#results_Update").dialog("open");
    }
    results()
})

/**
 * 成绩修改
 */
function results_update() {
    var student_id = $('#td3').html()
    var subjects = $('#text1').val()
    var results = $('#text2').val()
    $.ajax({
        type: "POST",
        url: "/results/update",
        data: {
            'id': resultsId,
            'subjects': subjects,
            'results': results,
            'student_id': student_id
        },
        dataType: "json",
        success: function (resp) {
            console.info(resp)
            if (resp.code == 0) {
            } else {
                //$("#searchResult").html("出现错误：" + data.msg);
            }
        },
        error: function (jqXHR) {
            aler("发生错误：" + jqXHR.status);
        }
    })
    alert('更新成功')
    $("#results_Update").dialog("close")
}


/**
 * 添加科目
 */
function add() {
    $("#resultsAdd").dialog("open");
}

function results_Add() {

    var subjects = $('#text3').val()
    var results = $('#text4').val()
    $.ajax({
        type: "POST",
        url: "/results/save",
        data: {
            'subjects': subjects,
            'results': results,
            'student_id': $('#td3').html()
        },
        dataType: "json",
        success: function (resp) {
            console.info(resp)
            if (resp.code == 0) {
            } else {
                //$("#searchResult").html("出现错误：" + data.msg);
            }
        },
        error: function (jqXHR) {
            aler("发生错误：" + jqXHR.status);
        }
    })
    alert('ok')
    $("#resultsAdd").dialog("close")
}




