	$(function() {
			$("#idchk").click(function() {
				var id = $("#id").val();
				$.ajax({
					url : "idCheck.jsp",
					data : {
						'id': id
					},
					success : function(result) {
						if ($.trim(result) == "NO") {
							alert("중복된 ID입니다.");
						} else {
							alert("사용가능한 ID입니다..");
							$("#check").val("0");
						}
					}
				});
				return false;
			});
		});