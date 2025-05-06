terraform {
  backend "s3" {
    bucket = "lnsi-test-lambda"
    key    = "dev/terraform.tfstate"
    region = "sa-east-1"
  }
}
