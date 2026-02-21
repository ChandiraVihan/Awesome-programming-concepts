%{
#include "calc.tab.h"
%}

NUM [0-9]+

%%
"+" { return ADDITION; }
"-" { return SUBTRACTION; }
"*" { return MULTIPLICATION; }
"/" { return DIVISION; }
"%" { return MODULUS; }
exit { return EXIT; }
{NUM}  { yylval.num = atoi(yytext); return NUMBER; }
[ \t\n]  ; /* Ignore whitespace */
.       { printf("Non-identified Operator: %s\n", yytext); }
%%

int yywrap() {  //to run on windows
    return 1;
}
