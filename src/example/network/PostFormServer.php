<?php
/**
 * 快速启动一个 Web
 * % php -S 127.0.0.1:8000
 */

printf("Request Method: %s\n\n", $_SERVER['REQUEST_METHOD']);
printf("Request Uri: %s\n\n", $_SERVER['REQUEST_URI']);

$headers = getallheaders();
printf("Headers:\n");
foreach ($headers as $param => $value) {
    printf("%s: %s\n", $param, $value);
}
printf("\n");

$inputData = file_get_contents("php://input");
printf("Raw HTTP Body: \n%s\n\n", $inputData);

printf("Query Params:\n");
foreach ($_GET as $param => $value) {
    printf("%s: %s\n", $param, $value);
}
printf("\n");

printf("Post Fields:\n");
foreach ($_POST as $param => $value) {
    printf("%s: %s\n", $param, $value);
}
printf("\n");
