%{
#include "hello.tab.h"
%}

HELLO "hello"

%%
{HELLO} { return HELLO; }
[ \t\n]  ; /* Ignore whitespace */
.       { printf("Invalid token: %s\n", yytext); }
%%

int yywrap() {
    return 1;
}
