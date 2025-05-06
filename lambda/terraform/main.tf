module "lambda" {
  source           = "./modules/lambda"
  lambda_name      = var.lambda_name
  runtime          = var.runtime
  handler          = var.handler
  role_name        = var.role_name
  lambda_jar_path  = var.lambda_jar_path
}
