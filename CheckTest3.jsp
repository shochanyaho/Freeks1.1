
<HTML>
    <BODY>
    <%-- (1) pageディレクティブでJSPプログラムの特性を定義 --%>
    <%@ page language="java"
        contentType="text/html; charset=Windows-31J" %>
    
    <%-- (2) 変数xを宣言 --%>
    <%! int x = 0; %>
    
    <%-- (3) スクリプトレット内でforループ処理を実行 --%>
    <%
        for (int i = 0; i < 10; i++) {
            x++;
        }
    %>
    
    <%-- (4) 式で実行結果を表示 --%>
    <H3>計算結果：<%= x %></H3>
    
    </BODY>
    </HTML>