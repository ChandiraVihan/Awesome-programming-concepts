%{
#include "stdio.h"
#include "stdlib.h"
#include "string.h"
int yylex();
void yyerror(const char *s);
%}

%union {
    char* str;
    int num;
}

%token ADDITION SUBTRACTION MULTIPLICATION DIVISION MODULUS EXIT
%token <num> NUMBER
%type <num> op_choice

%%
//rules


/*rule to keep the program running */
input:
    /* empty */
    | input line
    ;

/*calculation OR the exit command */
line:
    operator_or_exit
    ;

/*Logic to decide carry on or leave*/
operator_or_exit:
    op_choice prompt_left NUMBER prompt_right NUMBER 
    { 
        int res;
        /* $1 = op, $3 = first num, $5 = second num */
        if ($1 == 1) res = $3 + $5;
        else if ($1 == 2) res = $3 - $5;
        else if ($1 == 3) res = $3 * $5;
        else if ($1 == 4) {
            if($5 == 0) { printf("Error: Div by 0\n"); res = 0; }
            else res = $3 / $5;
        }
        else if ($1 == 5) res = $3 % $5;

        printf("Result = %d\n", res); 
        fflush(stdout);
    }
    | EXIT {
    exit(0);
    }
    ;

/* operator selection */
op_choice:
    ADDITION       { $$ = 1; }
    | SUBTRACTION  { $$ = 2; }
    | MULTIPLICATION { $$ = 3; }
    | DIVISION     { $$ = 4; }
    | MODULUS      { $$ = 5; }
    ;

prompt_left:  { printf("Left Side Number: ");
fflush(stdout);
} ;
prompt_right: { printf("Right Side Number: ");
fflush(stdout);
} ;

%%

void yyerror(const char *s) {
    fprintf(stderr, "Error: %s\n", s);
}

int main() {
     
    printf("Arithmetic Operation: \n");
    fflush(stdout);
    
    yyparse();
    return 0;
}

