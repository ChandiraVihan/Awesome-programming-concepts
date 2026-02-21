%{
#include <stdio.h>
#include <stdlib.h>
#include <string.h>  /* Required for strdup() */
int yylex();  /* Declare lexer function */
void yyerror(const char *s);
%}

%union {
    char* str;
    int num;
    }

%token ENGINE DOORS LIGHTS SPEED START STOP LOCK UNLOCK ON OFF SET EXIT
%token <num> NUMBER
%type <str> component action

%%

command : instruction 
				| command instruction
				;

instruction: component action   { printf("Command: %s %s\n", $1, $2); }
       | SPEED SET NUMBER     { printf("Command: Speed set: %d\n", $3); }
       | EXIT                { printf("Exiting...\n"); exit(0); }
       ;

component: ENGINE { $$ = strdup("Engine"); }
	 |  DOORS { $$ = strdup("Doors"); }
	 |  LIGHTS { $$ = strdup("Lights"); }
	 |  SPEED { $$ = strdup("Speed"); }
	   ;
action: START { $$ = strdup("Start"); }
       | STOP { $$ = strdup("Stop"); }
       | LOCK { $$ = strdup("Lock"); }
       | UNLOCK{ $$ = strdup("Unlock"); } 
       | ON { $$ = strdup("On"); }
       | OFF { $$ = strdup("Off"); }
       | SET { $$ = strdup("Set"); }
       ;

%%

void yyerror(const char *s) {
    fprintf(stderr, "Error: %s\n", s);
}

int main() {
    printf("Input: ");
    yyparse();
    return 0;
}
