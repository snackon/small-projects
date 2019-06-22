#include <stdio.h>
#include <stdbool.h>

int main(){
	int n;
	printf("Enter your limit: \n");
	scanf("%d", &n);

	bool arr[n];

	for (int p = 2; p * p <= n; p++) {
		if (arr[p] == false) {
			for (int i = p * p; i <= n; i += p) {
				arr[i] = true;
			}
		}
	}

	for (int i = 0; i <= n; i++) {
        printf("%d - %s\n", i, arr[i] == false ? "prime" : "non-prime");
    }
	
	return 0;
}
